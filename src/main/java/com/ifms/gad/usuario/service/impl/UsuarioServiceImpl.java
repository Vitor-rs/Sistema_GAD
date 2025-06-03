package com.ifms.gad.usuario.service.impl;

import com.ifms.gad.config.exception.BusinessException;
import com.ifms.gad.config.exception.ResourceNotFoundException;
import com.ifms.gad.usuario.dto.UsuarioCreateDTO;
import com.ifms.gad.usuario.dto.UsuarioResponseDTO;
import com.ifms.gad.usuario.dto.UsuarioUpdateDTO;
import com.ifms.gad.usuario.entity.FuncaoTag;
import com.ifms.gad.usuario.entity.Usuario;
import com.ifms.gad.usuario.entity.UsuarioFuncaoTag;
import com.ifms.gad.usuario.mapper.UsuarioMapperSimple;
import com.ifms.gad.usuario.repository.FuncaoTagRepository;
import com.ifms.gad.usuario.repository.UsuarioRepository;
import com.ifms.gad.usuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Implementação do serviço de Usuario
 */
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UsuarioServiceImpl implements UsuarioService {
    
    private final UsuarioRepository usuarioRepository;
    private final FuncaoTagRepository funcaoTagRepository;
    private final UsuarioMapperSimple usuarioMapper;

    private static final String USUARIO_NAO_ENCONTRADO_ID = "Usuário não encontrado com ID: ";
    private static final String FUNCAO_TAG_NAO_ENCONTRADA_ID = "Função/Tag não encontrada com ID: ";

    @Override
    @Transactional
    public UsuarioResponseDTO criar(UsuarioCreateDTO createDTO) {
        log.info("Iniciando criação de usuário com email: {}", createDTO.getEmail());
        
        // Validações de negócio
        validarEmailUnico(createDTO.getEmail(), null);
        validarCpfUnico(createDTO.getCpf(), null);
        validarSiapeUnico(createDTO.getSiape(), null);
        
        try {
            Usuario usuario = usuarioMapper.toEntity(createDTO);
            
            // Processa as funções/tags se informadas
            if (createDTO.getFuncaoTagIds() != null && !createDTO.getFuncaoTagIds().isEmpty()) {
                processarFuncaoTags(usuario, createDTO.getFuncaoTagIds());
            }
            
            usuario = usuarioRepository.save(usuario);
            
            log.info("Usuário criado com sucesso. ID: {}", usuario.getId());
            return usuarioMapper.toResponseDTO(usuario);
            
        } catch (Exception e) {
            log.error("Erro ao criar usuário: {}", e.getMessage(), e);
            throw new BusinessException("Erro ao criar usuário: " + e.getMessage());
        }
    }

    @Override
    public UsuarioResponseDTO buscarPorId(Long id) {
        log.info("Buscando usuário por ID: {}", id);
        
        Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> {
                log.warn("Usuário não encontrado com ID: {}", id);
                return new ResourceNotFoundException(USUARIO_NAO_ENCONTRADO_ID + id);
            });
        
        return usuarioMapper.toResponseDTO(usuario);
    }

    @Override
    @Transactional
    public UsuarioResponseDTO atualizar(Long id, UsuarioUpdateDTO updateDTO) {
        log.info("Iniciando atualização de usuário com ID: {}", id);
        
        Usuario usuarioExistente = usuarioRepository.findById(id)
            .orElseThrow(() -> {
                log.warn("Usuário não encontrado para atualização. ID: {}", id);
                return new ResourceNotFoundException(USUARIO_NAO_ENCONTRADO_ID + id);
            });
        
        // Validações de negócio se campos únicos foram alterados
        if (updateDTO.getEmail() != null && !updateDTO.getEmail().equals(usuarioExistente.getEmail())) {
            validarEmailUnico(updateDTO.getEmail(), id);
        }
        if (updateDTO.getCpf() != null && !updateDTO.getCpf().equals(usuarioExistente.getCpf())) {
            validarCpfUnico(updateDTO.getCpf(), id);
        }
        if (updateDTO.getSiape() != null && !updateDTO.getSiape().equals(usuarioExistente.getSiape())) {
            validarSiapeUnico(updateDTO.getSiape(), id);
        }
        
        try {
            usuarioMapper.updateEntityFromDTO(updateDTO, usuarioExistente);
            
            // Atualiza funções/tags se informadas
            if (updateDTO.getFuncaoTagIds() != null) {
                atualizarFuncaoTags(usuarioExistente, updateDTO.getFuncaoTagIds());
            }
            
            usuarioExistente = usuarioRepository.save(usuarioExistente);
            
            log.info("Usuário atualizado com sucesso. ID: {}", id);
            return usuarioMapper.toResponseDTO(usuarioExistente);
            
        } catch (Exception e) {
            log.error("Erro ao atualizar usuário: {}", e.getMessage(), e);
            throw new BusinessException("Erro ao atualizar usuário: " + e.getMessage());
        }
    }

    @Override
    @Transactional
    public void remover(Long id) {
        log.info("Iniciando remoção de usuário com ID: {}", id);
        
        Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> {
                log.warn("Usuário não encontrado para remoção. ID: {}", id);
                return new ResourceNotFoundException(USUARIO_NAO_ENCONTRADO_ID + id);
            });
        
        try {
            usuarioRepository.delete(usuario);
            log.info("Usuário removido com sucesso. ID: {}", id);
            
        } catch (Exception e) {
            log.error("Erro ao remover usuário: {}", e.getMessage(), e);
            throw new BusinessException("Erro ao remover usuário: " + e.getMessage());
        }
    }

    @Override
    public Page<UsuarioResponseDTO> listarTodos(Pageable pageable) {
        log.info("Listando todos os usuários. Página: {}, Tamanho: {}", 
                pageable.getPageNumber(), pageable.getPageSize());
        
        Page<Usuario> usuariosPage = usuarioRepository.findAll(pageable);
        return usuariosPage.map(usuarioMapper::toResponseDTO);
    }

    @Override
    public Page<UsuarioResponseDTO> buscarPorNome(String nome, Pageable pageable) {
        log.info("Buscando usuários por nome: {}", nome);
        
        Page<Usuario> usuariosPage = usuarioRepository.findByNomeContainingIgnoreCase(nome, pageable);
        return usuariosPage.map(usuarioMapper::toResponseDTO);
    }

    @Override
    public UsuarioResponseDTO buscarPorEmail(String email) {
        log.info("Buscando usuário por email: {}", email);
        
        Usuario usuario = usuarioRepository.findByEmail(email)
            .orElseThrow(() -> {
                log.warn("Usuário não encontrado com email: {}", email);
                return new ResourceNotFoundException("Usuário não encontrado com email: " + email);
            });
        
        return usuarioMapper.toResponseDTO(usuario);
    }

    @Override
    public UsuarioResponseDTO buscarPorCpf(String cpf) {
        log.info("Buscando usuário por CPF: {}", cpf);
        
        Usuario usuario = usuarioRepository.findByCpf(cpf)
            .orElseThrow(() -> {
                log.warn("Usuário não encontrado com CPF: {}", cpf);
                return new ResourceNotFoundException("Usuário não encontrado com CPF: " + cpf);
            });
        
        return usuarioMapper.toResponseDTO(usuario);
    }    @Override
    public UsuarioResponseDTO buscarPorSiape(String siape) {
        log.info("Buscando usuário por SIAPE: {}", siape);
        
        Usuario usuario = usuarioRepository.findBySiape(siape)
            .orElseThrow(() -> {
                log.warn("Usuário não encontrado com SIAPE: {}", siape);
                return new ResourceNotFoundException("Usuário não encontrado com SIAPE: " + siape);
            });
        
        return usuarioMapper.toResponseDTO(usuario);
    }

    @Override
    public Page<UsuarioResponseDTO> buscarAtivos(Pageable pageable) {
        log.info("Buscando usuários ativos. Página: {}, Tamanho: {}", 
                pageable.getPageNumber(), pageable.getPageSize());
        
        Page<Usuario> usuariosPage = usuarioRepository.findByAtivoTrue(pageable);
        return usuariosPage.map(usuarioMapper::toResponseDTO);
    }

    @Override
    public Page<UsuarioResponseDTO> buscarPorLotacao(String lotacao, Pageable pageable) {
        log.info("Buscando usuários por lotação: {}", lotacao);
        
        Page<Usuario> usuariosPage = usuarioRepository.findByLotacaoContainingIgnoreCase(lotacao, pageable);
        return usuariosPage.map(usuarioMapper::toResponseDTO);
    }

    @Override
    public Page<UsuarioResponseDTO> buscarPorFormacao(String formacao, Pageable pageable) {
        log.info("Buscando usuários por formação: {}", formacao);
        
        Page<Usuario> usuariosPage = usuarioRepository.findByFormacaoContainingIgnoreCase(formacao, pageable);
        return usuariosPage.map(usuarioMapper::toResponseDTO);
    }    @Override
    public List<UsuarioResponseDTO> buscarPorFuncao(String codigoFuncao) {
        log.info("Buscando usuários por função: {}", codigoFuncao);
        
        List<Usuario> usuarios = usuarioRepository.findByFuncaoTagCodigoAndAtivo(codigoFuncao);
        return usuarios.stream()
                .map(usuarioMapper::toResponseDTO)
                .toList();
    }

    @Override
    public Page<UsuarioResponseDTO> buscarPorFuncao(String codigoFuncao, Pageable pageable) {
        log.info("Buscando usuários por função: {} - Página: {}, Tamanho: {}", 
                codigoFuncao, pageable.getPageNumber(), pageable.getPageSize());
        
        Page<Usuario> usuariosPage = usuarioRepository.findByFuncaoTagCodigoAndAtivo(codigoFuncao, pageable);
        return usuariosPage.map(usuarioMapper::toResponseDTO);
    }

    @Override
    @Transactional
    public UsuarioResponseDTO ativar(Long id) {
        log.info("Ativando usuário com ID: {}", id);
        
        Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> {
                log.warn("Usuário não encontrado para ativação. ID: {}", id);
                return new ResourceNotFoundException(USUARIO_NAO_ENCONTRADO_ID + id);
            });
        
        if (usuario.isAtivo()) {
            log.warn("Tentativa de ativar usuário já ativo. ID: {}", id);
            throw new BusinessException("Usuário já está ativo");
        }
        
        usuario.setAtivo(true);
        usuario = usuarioRepository.save(usuario);
        
        log.info("Usuário ativado com sucesso. ID: {}", id);
        return usuarioMapper.toResponseDTO(usuario);
    }

    @Override
    @Transactional
    public UsuarioResponseDTO inativar(Long id) {
        log.info("Inativando usuário com ID: {}", id);
        
        Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> {
                log.warn("Usuário não encontrado para inativação. ID: {}", id);
                return new ResourceNotFoundException(USUARIO_NAO_ENCONTRADO_ID + id);
            });
        
        if (!usuario.isAtivo()) {
            log.warn("Tentativa de inativar usuário já inativo. ID: {}", id);
            throw new BusinessException("Usuário já está inativo");
        }
        
        usuario.setAtivo(false);
        usuario = usuarioRepository.save(usuario);
        
        log.info("Usuário inativado com sucesso. ID: {}", id);
        return usuarioMapper.toResponseDTO(usuario);
    }

    @Override
    @Transactional
    public UsuarioResponseDTO atribuirFuncoes(Long usuarioId, Set<Long> funcaoTagIds) {
        log.info("Atribuindo funções ao usuário ID: {}. Funções: {}", usuarioId, funcaoTagIds);
        
        Usuario usuario = usuarioRepository.findById(usuarioId)
            .orElseThrow(() -> {
                log.warn("Usuário não encontrado para atribuição de funções. ID: {}", usuarioId);
                return new ResourceNotFoundException(USUARIO_NAO_ENCONTRADO_ID + usuarioId);
            });
        
        for (Long funcaoTagId : funcaoTagIds) {
            FuncaoTag funcaoTag = funcaoTagRepository.findById(funcaoTagId)
                .orElseThrow(() -> {
                    log.warn("Função/Tag não encontrada. ID: {}", funcaoTagId);
                    return new ResourceNotFoundException(FUNCAO_TAG_NAO_ENCONTRADA_ID + funcaoTagId);
                });
            
            if (!funcaoTag.isAtivo()) {
                log.warn("Tentativa de atribuir função/tag inativa. Função ID: {}", funcaoTagId);
                throw new BusinessException("Não é possível atribuir função/tag inativa: " + funcaoTag.getCodigo());
            }
            
            // Verifica se a função já não está atribuída
            boolean jaAtribuida = usuario.getFuncaoTags().stream()
                .anyMatch(uft -> uft.getFuncaoTag().getId().equals(funcaoTagId) && uft.isAtivo());
                
            if (!jaAtribuida) {
                UsuarioFuncaoTag usuarioFuncaoTag = UsuarioFuncaoTag.builder()
                    .usuario(usuario)
                    .funcaoTag(funcaoTag)
                    .ativo(true)
                    .build();
                    
                usuario.getFuncaoTags().add(usuarioFuncaoTag);
                log.info("Função atribuída: {} para usuário ID: {}", funcaoTag.getCodigo(), usuarioId);
            } else {
                log.info("Função {} já está atribuída ao usuário ID: {}", funcaoTag.getCodigo(), usuarioId);
            }
        }
        
        usuario = usuarioRepository.save(usuario);
        
        log.info("Funções atribuídas com sucesso ao usuário ID: {}", usuarioId);
        return usuarioMapper.toResponseDTO(usuario);
    }

    @Override
    @Transactional
    public UsuarioResponseDTO removerFuncoes(Long usuarioId, Set<Long> funcaoTagIds) {
        log.info("Removendo funções do usuário ID: {}. Funções: {}", usuarioId, funcaoTagIds);
        
        Usuario usuario = usuarioRepository.findById(usuarioId)
            .orElseThrow(() -> {
                log.warn("Usuário não encontrado para remoção de funções. ID: {}", usuarioId);
                return new ResourceNotFoundException(USUARIO_NAO_ENCONTRADO_ID + usuarioId);
            });
        
        for (Long funcaoTagId : funcaoTagIds) {
            usuario.getFuncaoTags().stream()
                .filter(uft -> uft.getFuncaoTag().getId().equals(funcaoTagId) && uft.isAtivo())
                .findFirst()
                .ifPresent(uft -> {
                    uft.setAtivo(false);
                    log.info("Função removida: {} do usuário ID: {}", uft.getFuncaoTag().getCodigo(), usuarioId);
                });
        }
        
        usuario = usuarioRepository.save(usuario);
        
        log.info("Funções removidas com sucesso do usuário ID: {}", usuarioId);
        return usuarioMapper.toResponseDTO(usuario);
    }

    @Override
    public Page<UsuarioResponseDTO> buscarComFiltros(String nome, String email, String lotacao, 
                                                     String formacao, Boolean ativo, Pageable pageable) {
        log.info("Buscando usuários com filtros - Nome: {}, Email: {}, Lotação: {}, Formação: {}, Ativo: {}", 
                nome, email, lotacao, formacao, ativo);
        
        Page<Usuario> usuariosPage = usuarioRepository.findWithFilters(nome, email, lotacao, formacao, ativo, pageable);
        return usuariosPage.map(usuarioMapper::toResponseDTO);
    }

    /**
     * Processa as funções/tags na criação do usuário
     */
    private void processarFuncaoTags(Usuario usuario, Set<Long> funcaoTagIds) {
        Set<UsuarioFuncaoTag> usuarioFuncaoTags = new HashSet<>();
        
        for (Long funcaoTagId : funcaoTagIds) {            FuncaoTag funcaoTag = funcaoTagRepository.findById(funcaoTagId)
                .orElseThrow(() -> {
                    log.warn("Função/Tag não encontrada na criação. ID: {}", funcaoTagId);
                    return new ResourceNotFoundException(FUNCAO_TAG_NAO_ENCONTRADA_ID + funcaoTagId);
                });
                
            if (!funcaoTag.isAtivo()) {
                log.warn("Tentativa de atribuir função/tag inativa na criação. Função ID: {}", funcaoTagId);
                throw new BusinessException("Não é possível atribuir função/tag inativa: " + funcaoTag.getCodigo());
            }
            
            UsuarioFuncaoTag usuarioFuncaoTag = UsuarioFuncaoTag.builder()
                .usuario(usuario)
                .funcaoTag(funcaoTag)
                .ativo(true)
                .build();
                
            usuarioFuncaoTags.add(usuarioFuncaoTag);
        }
        
        usuario.setFuncaoTags(usuarioFuncaoTags);
    }

    /**
     * Atualiza funções/tags do usuário
     */
    private void atualizarFuncaoTags(Usuario usuario, Set<Long> novasFuncaoTagIds) {
        // Desativa todas as funções atuais
        usuario.getFuncaoTags().forEach(uft -> uft.setAtivo(false));
        
        // Ativa ou cria as novas funções
        for (Long funcaoTagId : novasFuncaoTagIds) {            FuncaoTag funcaoTag = funcaoTagRepository.findById(funcaoTagId)
                .orElseThrow(() -> {
                    log.warn("Função/Tag não encontrada na atualização. ID: {}", funcaoTagId);
                    return new ResourceNotFoundException(FUNCAO_TAG_NAO_ENCONTRADA_ID + funcaoTagId);
                });
                
            if (!funcaoTag.isAtivo()) {
                log.warn("Tentativa de atribuir função/tag inativa na atualização. Função ID: {}", funcaoTagId);
                throw new BusinessException("Não é possível atribuir função/tag inativa: " + funcaoTag.getCodigo());
            }
            
            // Procura se já existe a associação
            Optional<UsuarioFuncaoTag> existente = usuario.getFuncaoTags().stream()
                .filter(uft -> uft.getFuncaoTag().getId().equals(funcaoTagId))
                .findFirst();
                
            if (existente.isPresent()) {
                existente.get().setAtivo(true);
            } else {
                UsuarioFuncaoTag novaAssociacao = UsuarioFuncaoTag.builder()
                    .usuario(usuario)
                    .funcaoTag(funcaoTag)
                    .ativo(true)
                    .build();
                    
                usuario.getFuncaoTags().add(novaAssociacao);
            }
        }
    }

    /**
     * Valida se o email é único no sistema
     */
    private void validarEmailUnico(String email, Long idExcluir) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findByEmail(email);
        
        if (usuarioExistente.isPresent() && 
            (idExcluir == null || !usuarioExistente.get().getId().equals(idExcluir))) {
            log.warn("Email já cadastrado: {}", email);
            throw new BusinessException("Email já está em uso: " + email);
        }
    }

    /**
     * Valida se o CPF é único no sistema
     */
    private void validarCpfUnico(String cpf, Long idExcluir) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findByCpf(cpf);
        
        if (usuarioExistente.isPresent() && 
            (idExcluir == null || !usuarioExistente.get().getId().equals(idExcluir))) {
            log.warn("CPF já cadastrado: {}", cpf);
            throw new BusinessException("CPF já está em uso: " + cpf);
        }
    }

    /**
     * Valida se o SIAPE é único no sistema
     */
    private void validarSiapeUnico(String siape, Long idExcluir) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findBySiape(siape);
        
        if (usuarioExistente.isPresent() && 
            (idExcluir == null || !usuarioExistente.get().getId().equals(idExcluir))) {
            log.warn("SIAPE já cadastrado: {}", siape);
            throw new BusinessException("SIAPE já está em uso: " + siape);
        }
    }
}
