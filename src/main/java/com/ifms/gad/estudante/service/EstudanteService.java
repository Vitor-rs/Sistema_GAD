package com.ifms.gad.estudante.service;

import com.ifms.gad.estudante.dto.EstudanteCreateDTO;
import com.ifms.gad.estudante.dto.EstudanteResponseDTO;
import com.ifms.gad.estudante.dto.EstudanteUpdateDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Interface de serviço para operações relacionadas a Estudante
 */
public interface EstudanteService {
    
    /**
     * Cria um novo estudante
     * @param createDTO dados para criação
     * @return estudante criado
     */
    EstudanteResponseDTO criar(EstudanteCreateDTO createDTO);
    
    /**
     * Busca um estudante por ID
     * @param id identificador do estudante
     * @return estudante encontrado
     */
    EstudanteResponseDTO buscarPorId(Long id);
    
    /**
     * Atualiza um estudante existente
     * @param id identificador do estudante
     * @param updateDTO dados para atualização
     * @return estudante atualizado
     */
    EstudanteResponseDTO atualizar(Long id, EstudanteUpdateDTO updateDTO);
    
    /**
     * Remove um estudante por ID
     * @param id identificador do estudante
     */
    void remover(Long id);
    
    /**
     * Lista todos os estudantes com paginação
     * @param pageable configuração de paginação
     * @return página de estudantes
     */
    Page<EstudanteResponseDTO> listarTodos(Pageable pageable);
    
    /**
     * Busca estudantes por nome
     * @param nome nome ou parte do nome
     * @param pageable configuração de paginação
     * @return página de estudantes
     */
    Page<EstudanteResponseDTO> buscarPorNome(String nome, Pageable pageable);
    
    /**
     * Busca estudantes por email
     * @param email email do estudante
     * @return estudante encontrado
     */
    EstudanteResponseDTO buscarPorEmail(String email);
    
    /**
     * Busca estudantes por CPF
     * @param cpf CPF do estudante
     * @return estudante encontrado
     */
    EstudanteResponseDTO buscarPorCpf(String cpf);
    
    /**
     * Busca estudantes ativos
     * @param pageable configuração de paginação
     * @return página de estudantes ativos
     */
    Page<EstudanteResponseDTO> buscarAtivos(Pageable pageable);
    
    /**
     * Ativa um estudante
     * @param id identificador do estudante
     * @return estudante ativado
     */
    EstudanteResponseDTO ativar(Long id);
    
    /**
     * Inativa um estudante
     * @param id identificador do estudante
     * @return estudante inativado
     */
    EstudanteResponseDTO inativar(Long id);
}
