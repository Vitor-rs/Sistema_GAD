package com.ifms.gad.estudante.service.impl;

import com.ifms.gad.config.exception.BusinessException;
import com.ifms.gad.config.exception.ResourceNotFoundException;
import com.ifms.gad.estudante.dto.EstudanteCreateDTO;
import com.ifms.gad.estudante.dto.EstudanteResponseDTO;
import com.ifms.gad.estudante.dto.EstudanteUpdateDTO;
import com.ifms.gad.estudante.entity.Estudante;
import com.ifms.gad.estudante.mapper.EstudanteMapper;
import com.ifms.gad.estudante.repository.EstudanteRepository;
import com.ifms.gad.estudante.service.EstudanteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Implementação do serviço de Estudante
 */
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EstudanteServiceImpl implements EstudanteService {
    
    private static final String ESTUDANTE_NAO_ENCONTRADO_ID = "Estudante não encontrado com ID: ";
    private static final String ERRO_INTERNO_PREFIX = "Erro interno ao ";
    
    private final EstudanteRepository estudanteRepository;
    private final EstudanteMapper estudanteMapper;
    
    @Override
    @Transactional
    public EstudanteResponseDTO criar(EstudanteCreateDTO createDTO) {
        log.info("Iniciando criação de estudante com email: {}", createDTO.getEmail());
        
        // Validações de negócio
        validarEmailUnico(createDTO.getEmail(), null);
        validarCpfUnico(createDTO.getCpf(), null);
        
        try {
            Estudante estudante = estudanteMapper.toEntity(createDTO);
            estudante = estudanteRepository.save(estudante);
            
            log.info("Estudante criado com sucesso. ID: {}", estudante.getId());
            return estudanteMapper.toResponseDTO(estudante);
              } catch (Exception e) {
            log.error("Erro ao criar estudante: {}", e.getMessage(), e);
            throw new BusinessException(ERRO_INTERNO_PREFIX + "criar estudante");
        }
    }
    
    @Override
    public EstudanteResponseDTO buscarPorId(Long id) {
        log.info("Buscando estudante por ID: {}", id);
          Estudante estudante = estudanteRepository.findById(id)
            .orElseThrow(() -> {
                log.warn("Estudante não encontrado com ID: {}", id);
                return new ResourceNotFoundException(ESTUDANTE_NAO_ENCONTRADO_ID + id);
            });
        
        return estudanteMapper.toResponseDTO(estudante);
    }
    
    @Override
    @Transactional
    public EstudanteResponseDTO atualizar(Long id, EstudanteUpdateDTO updateDTO) {
        log.info("Iniciando atualização de estudante com ID: {}", id);
        
        Estudante estudanteExistente = estudanteRepository.findById(id)
            .orElseThrow(() -> {                log.warn("Estudante não encontrado para atualização. ID: {}", id);
                return new ResourceNotFoundException(ESTUDANTE_NAO_ENCONTRADO_ID + id);
            });
        
        // Validações de negócio se email ou CPF foram alterados
        if (updateDTO.getEmail() != null && !updateDTO.getEmail().equals(estudanteExistente.getEmail())) {
            validarEmailUnico(updateDTO.getEmail(), id);
        }
        
        if (updateDTO.getCpf() != null && !updateDTO.getCpf().equals(estudanteExistente.getCpf())) {
            validarCpfUnico(updateDTO.getCpf(), id);
        }
        
        try {
            estudanteMapper.updateEntityFromDTO(updateDTO, estudanteExistente);
            estudanteExistente = estudanteRepository.save(estudanteExistente);
            
            log.info("Estudante atualizado com sucesso. ID: {}", id);
            return estudanteMapper.toResponseDTO(estudanteExistente);
              } catch (Exception e) {
            log.error("Erro ao atualizar estudante: {}", e.getMessage(), e);
            throw new BusinessException(ERRO_INTERNO_PREFIX + "atualizar estudante");
        }
    }
    
    @Override
    @Transactional
    public void remover(Long id) {
        log.info("Iniciando remoção de estudante com ID: {}", id);
        
        if (!estudanteRepository.existsById(id)) {            log.warn("Tentativa de remover estudante inexistente. ID: {}", id);
            throw new ResourceNotFoundException(ESTUDANTE_NAO_ENCONTRADO_ID + id);
        }
        
        try {
            estudanteRepository.deleteById(id);
            log.info("Estudante removido com sucesso. ID: {}", id);
              } catch (Exception e) {
            log.error("Erro ao remover estudante: {}", e.getMessage(), e);
            throw new BusinessException(ERRO_INTERNO_PREFIX + "remover estudante");
        }
    }
    
    @Override
    public Page<EstudanteResponseDTO> listarTodos(Pageable pageable) {
        log.info("Listando todos os estudantes. Página: {}, Tamanho: {}", 
                pageable.getPageNumber(), pageable.getPageSize());
        
        Page<Estudante> estudantesPage = estudanteRepository.findAll(pageable);
        return estudantesPage.map(estudanteMapper::toResponseDTO);
    }
    
    @Override
    public Page<EstudanteResponseDTO> buscarPorNome(String nome, Pageable pageable) {
        log.info("Buscando estudantes por nome: {} - Página: {}, Tamanho: {}", 
                nome, pageable.getPageNumber(), pageable.getPageSize());
        
        Page<Estudante> estudantesPage = estudanteRepository.findByNomeContainingIgnoreCase(nome, pageable);
        return estudantesPage.map(estudanteMapper::toResponseDTO);
    }
    
    @Override
    public EstudanteResponseDTO buscarPorEmail(String email) {
        log.info("Buscando estudante por email: {}", email);
        
        Estudante estudante = estudanteRepository.findByEmail(email)
            .orElseThrow(() -> {
                log.warn("Estudante não encontrado com email: {}", email);
                return new ResourceNotFoundException("Estudante não encontrado com email: " + email);
            });
        
        return estudanteMapper.toResponseDTO(estudante);
    }
    
    @Override
    public EstudanteResponseDTO buscarPorCpf(String cpf) {
        log.info("Buscando estudante por CPF: {}", cpf);
        
        Estudante estudante = estudanteRepository.findByCpf(cpf)
            .orElseThrow(() -> {
                log.warn("Estudante não encontrado com CPF: {}", cpf);
                return new ResourceNotFoundException("Estudante não encontrado com CPF: " + cpf);
            });
        
        return estudanteMapper.toResponseDTO(estudante);
    }
    
    @Override
    public Page<EstudanteResponseDTO> buscarAtivos(Pageable pageable) {
        log.info("Buscando estudantes ativos. Página: {}, Tamanho: {}", 
                pageable.getPageNumber(), pageable.getPageSize());
        
        Page<Estudante> estudantesPage = estudanteRepository.findByAtivoTrue(pageable);
        return estudantesPage.map(estudanteMapper::toResponseDTO);
    }
    
    @Override
    @Transactional
    public EstudanteResponseDTO ativar(Long id) {
        log.info("Ativando estudante com ID: {}", id);
        
        Estudante estudante = estudanteRepository.findById(id)
            .orElseThrow(() -> {                log.warn("Estudante não encontrado para ativação. ID: {}", id);
                return new ResourceNotFoundException(ESTUDANTE_NAO_ENCONTRADO_ID + id);
            });
        
        if (estudante.isAtivo()) {
            log.warn("Tentativa de ativar estudante já ativo. ID: {}", id);
            throw new BusinessException("Estudante já está ativo");
        }
        
        estudante.setAtivo(true);
        estudante = estudanteRepository.save(estudante);
        
        log.info("Estudante ativado com sucesso. ID: {}", id);
        return estudanteMapper.toResponseDTO(estudante);
    }
    
    @Override
    @Transactional
    public EstudanteResponseDTO inativar(Long id) {
        log.info("Inativando estudante com ID: {}", id);
        
        Estudante estudante = estudanteRepository.findById(id)
            .orElseThrow(() -> {                log.warn("Estudante não encontrado para inativação. ID: {}", id);
                return new ResourceNotFoundException(ESTUDANTE_NAO_ENCONTRADO_ID + id);
            });
        
        if (!estudante.isAtivo()) {
            log.warn("Tentativa de inativar estudante já inativo. ID: {}", id);
            throw new BusinessException("Estudante já está inativo");
        }
        
        estudante.setAtivo(false);
        estudante = estudanteRepository.save(estudante);
        
        log.info("Estudante inativado com sucesso. ID: {}", id);
        return estudanteMapper.toResponseDTO(estudante);
    }
    
    /**
     * Valida se o email é único no sistema
     */
    private void validarEmailUnico(String email, Long idExcluir) {
        Optional<Estudante> estudanteExistente = estudanteRepository.findByEmail(email);
        
        if (estudanteExistente.isPresent() && 
            (idExcluir == null || !estudanteExistente.get().getId().equals(idExcluir))) {
            log.warn("Email já cadastrado: {}", email);
            throw new BusinessException("Email já está em uso: " + email);
        }
    }
    
    /**
     * Valida se o CPF é único no sistema
     */
    private void validarCpfUnico(String cpf, Long idExcluir) {
        Optional<Estudante> estudanteExistente = estudanteRepository.findByCpf(cpf);
        
        if (estudanteExistente.isPresent() && 
            (idExcluir == null || !estudanteExistente.get().getId().equals(idExcluir))) {
            log.warn("CPF já cadastrado: {}", cpf);
            throw new BusinessException("CPF já está em uso: " + cpf);
        }
    }
}
