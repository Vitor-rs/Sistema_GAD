package com.ifms.gad.usuario.service.impl;

import com.ifms.gad.config.exception.BusinessException;
import com.ifms.gad.config.exception.ResourceNotFoundException;
import com.ifms.gad.usuario.dto.FuncaoTagCreateDTO;
import com.ifms.gad.usuario.dto.FuncaoTagResponseDTO;
import com.ifms.gad.usuario.dto.FuncaoTagUpdateDTO;
import com.ifms.gad.usuario.entity.FuncaoTag;
import com.ifms.gad.usuario.mapper.FuncaoTagMapperSimple;
import com.ifms.gad.usuario.repository.FuncaoTagRepository;
import com.ifms.gad.usuario.service.FuncaoTagService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Implementação do serviço de FuncaoTag
 */
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FuncaoTagServiceImpl implements FuncaoTagService {

    private final FuncaoTagRepository funcaoTagRepository;
    private final FuncaoTagMapperSimple funcaoTagMapper;

    private static final String FUNCAO_TAG_NAO_ENCONTRADA_ID = "Função/Tag não encontrada com ID: ";

    @Override
    @Transactional
    public FuncaoTagResponseDTO criar(FuncaoTagCreateDTO createDTO) {
        log.info("Iniciando criação de função/tag com código: {}", createDTO.getCodigo());
        
        // Validação de negócio
        validarCodigoUnico(createDTO.getCodigo(), null);
        
        try {
            FuncaoTag funcaoTag = funcaoTagMapper.toEntity(createDTO);
            funcaoTag = funcaoTagRepository.save(funcaoTag);
            
            log.info("Função/Tag criada com sucesso. ID: {}, Código: {}", 
                    funcaoTag.getId(), funcaoTag.getCodigo());
            return funcaoTagMapper.toResponseDTO(funcaoTag);
            
        } catch (Exception e) {
            log.error("Erro ao criar função/tag: {}", e.getMessage(), e);
            throw new BusinessException("Erro ao criar função/tag: " + e.getMessage());
        }
    }

    @Override
    public FuncaoTagResponseDTO buscarPorId(Long id) {
        log.info("Buscando função/tag por ID: {}", id);
        
        FuncaoTag funcaoTag = funcaoTagRepository.findById(id)
            .orElseThrow(() -> {
                log.warn("Função/Tag não encontrada com ID: {}", id);
                return new ResourceNotFoundException(FUNCAO_TAG_NAO_ENCONTRADA_ID + id);
            });
        
        return funcaoTagMapper.toResponseDTO(funcaoTag);
    }

    @Override
    public FuncaoTagResponseDTO buscarPorCodigo(String codigo) {
        log.info("Buscando função/tag por código: {}", codigo);
        
        FuncaoTag funcaoTag = funcaoTagRepository.findByCodigo(codigo)
            .orElseThrow(() -> {
                log.warn("Função/Tag não encontrada com código: {}", codigo);
                return new ResourceNotFoundException("Função/Tag não encontrada com código: " + codigo);
            });
        
        return funcaoTagMapper.toResponseDTO(funcaoTag);
    }

    @Override
    @Transactional
    public FuncaoTagResponseDTO atualizar(Long id, FuncaoTagUpdateDTO updateDTO) {
        log.info("Iniciando atualização de função/tag com ID: {}", id);
        
        FuncaoTag funcaoTagExistente = funcaoTagRepository.findById(id)
            .orElseThrow(() -> {
                log.warn("Função/Tag não encontrada para atualização. ID: {}", id);
                return new ResourceNotFoundException(FUNCAO_TAG_NAO_ENCONTRADA_ID + id);
            });
        
        // Validação de negócio se código foi alterado
        if (updateDTO.getCodigo() != null && !updateDTO.getCodigo().equals(funcaoTagExistente.getCodigo())) {
            validarCodigoUnico(updateDTO.getCodigo(), id);
        }
        
        try {
            funcaoTagMapper.updateEntityFromDTO(updateDTO, funcaoTagExistente);
            funcaoTagExistente = funcaoTagRepository.save(funcaoTagExistente);
            
            log.info("Função/Tag atualizada com sucesso. ID: {}", id);
            return funcaoTagMapper.toResponseDTO(funcaoTagExistente);
            
        } catch (Exception e) {
            log.error("Erro ao atualizar função/tag: {}", e.getMessage(), e);
            throw new BusinessException("Erro ao atualizar função/tag: " + e.getMessage());
        }
    }

    @Override
    @Transactional
    public void remover(Long id) {
        log.info("Iniciando remoção de função/tag com ID: {}", id);
        
        FuncaoTag funcaoTag = funcaoTagRepository.findById(id)
            .orElseThrow(() -> {
                log.warn("Função/Tag não encontrada para remoção. ID: {}", id);
                return new ResourceNotFoundException(FUNCAO_TAG_NAO_ENCONTRADA_ID + id);
            });
        
        try {
            funcaoTagRepository.delete(funcaoTag);
            log.info("Função/Tag removida com sucesso. ID: {}", id);
            
        } catch (Exception e) {
            log.error("Erro ao remover função/tag: {}", e.getMessage(), e);
            throw new BusinessException("Erro ao remover função/tag: " + e.getMessage());
        }
    }

    @Override
    public Page<FuncaoTagResponseDTO> listarTodas(Pageable pageable) {
        log.info("Listando todas as funções/tags. Página: {}, Tamanho: {}", 
                pageable.getPageNumber(), pageable.getPageSize());
        
        Page<FuncaoTag> funcaoTagsPage = funcaoTagRepository.findAll(pageable);
        return funcaoTagsPage.map(funcaoTagMapper::toResponseDTO);
    }

    @Override
    public List<FuncaoTagResponseDTO> listarAtivas() {
        log.info("Listando todas as funções/tags ativas");
        
        List<FuncaoTag> funcaoTags = funcaoTagRepository.findByAtivoTrue();
        return funcaoTags.stream()
                .map(funcaoTagMapper::toResponseDTO)
                .toList();
    }

    @Override
    public Page<FuncaoTagResponseDTO> buscarAtivas(Pageable pageable) {
        log.info("Buscando funções/tags ativas. Página: {}, Tamanho: {}", 
                pageable.getPageNumber(), pageable.getPageSize());
        
        Page<FuncaoTag> funcaoTagsPage = funcaoTagRepository.findByAtivoTrue(pageable);
        return funcaoTagsPage.map(funcaoTagMapper::toResponseDTO);
    }

    @Override
    public Page<FuncaoTagResponseDTO> buscarPorNome(String nome, Pageable pageable) {
        log.info("Buscando funções/tags por nome: {}", nome);
        
        Page<FuncaoTag> funcaoTagsPage = funcaoTagRepository.findByNomeContainingIgnoreCase(nome, pageable);
        return funcaoTagsPage.map(funcaoTagMapper::toResponseDTO);
    }

    @Override
    public Page<FuncaoTagResponseDTO> buscarPorCodigo(String codigo, Pageable pageable) {
        log.info("Buscando funções/tags por código: {}", codigo);
        
        Page<FuncaoTag> funcaoTagsPage = funcaoTagRepository.findByCodigoContainingIgnoreCase(codigo, pageable);
        return funcaoTagsPage.map(funcaoTagMapper::toResponseDTO);
    }

    @Override
    @Transactional
    public FuncaoTagResponseDTO ativar(Long id) {
        log.info("Ativando função/tag com ID: {}", id);
        
        FuncaoTag funcaoTag = funcaoTagRepository.findById(id)
            .orElseThrow(() -> {
                log.warn("Função/Tag não encontrada para ativação. ID: {}", id);
                return new ResourceNotFoundException(FUNCAO_TAG_NAO_ENCONTRADA_ID + id);
            });
        
        if (funcaoTag.isAtivo()) {
            log.warn("Tentativa de ativar função/tag já ativa. ID: {}", id);
            throw new BusinessException("Função/Tag já está ativa");
        }
        
        funcaoTag.setAtivo(true);
        funcaoTag = funcaoTagRepository.save(funcaoTag);
        
        log.info("Função/Tag ativada com sucesso. ID: {}", id);
        return funcaoTagMapper.toResponseDTO(funcaoTag);
    }

    @Override
    @Transactional
    public FuncaoTagResponseDTO inativar(Long id) {
        log.info("Inativando função/tag com ID: {}", id);
        
        FuncaoTag funcaoTag = funcaoTagRepository.findById(id)
            .orElseThrow(() -> {
                log.warn("Função/Tag não encontrada para inativação. ID: {}", id);
                return new ResourceNotFoundException(FUNCAO_TAG_NAO_ENCONTRADA_ID + id);
            });
        
        if (!funcaoTag.isAtivo()) {
            log.warn("Tentativa de inativar função/tag já inativa. ID: {}", id);
            throw new BusinessException("Função/Tag já está inativa");
        }
        
        funcaoTag.setAtivo(false);
        funcaoTag = funcaoTagRepository.save(funcaoTag);
        
        log.info("Função/Tag inativada com sucesso. ID: {}", id);
        return funcaoTagMapper.toResponseDTO(funcaoTag);
    }

    @Override
    public Page<FuncaoTagResponseDTO> buscarComFiltros(String codigo, String nome, Boolean ativo, Pageable pageable) {
        log.info("Buscando funções/tags com filtros - Código: {}, Nome: {}, Ativo: {}", 
                codigo, nome, ativo);
        
        Page<FuncaoTag> funcaoTagsPage = funcaoTagRepository.findWithFilters(codigo, nome, ativo, pageable);
        return funcaoTagsPage.map(funcaoTagMapper::toResponseDTO);
    }

    /**
     * Valida se o código é único no sistema
     */
    private void validarCodigoUnico(String codigo, Long idExcluir) {
        Optional<FuncaoTag> funcaoTagExistente = funcaoTagRepository.findByCodigo(codigo);
        
        if (funcaoTagExistente.isPresent() && 
            (idExcluir == null || !funcaoTagExistente.get().getId().equals(idExcluir))) {
            log.warn("Código já cadastrado: {}", codigo);
            throw new BusinessException("Código já está em uso: " + codigo);
        }
    }
}
