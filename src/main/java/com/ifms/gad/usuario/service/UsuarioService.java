package com.ifms.gad.usuario.service;

import com.ifms.gad.usuario.dto.UsuarioCreateDTO;
import com.ifms.gad.usuario.dto.UsuarioResponseDTO;
import com.ifms.gad.usuario.dto.UsuarioUpdateDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Set;

/**
 * Interface de serviço para operações relacionadas a Usuario
 */
public interface UsuarioService {

    /**
     * Cria um novo usuário
     * @param createDTO dados para criação
     * @return usuário criado
     */
    UsuarioResponseDTO criar(UsuarioCreateDTO createDTO);

    /**
     * Busca usuário por ID
     * @param id identificador do usuário
     * @return usuário encontrado
     */
    UsuarioResponseDTO buscarPorId(Long id);

    /**
     * Atualiza dados do usuário
     * @param id identificador do usuário
     * @param updateDTO dados para atualização
     * @return usuário atualizado
     */
    UsuarioResponseDTO atualizar(Long id, UsuarioUpdateDTO updateDTO);

    /**
     * Remove usuário do sistema
     * @param id identificador do usuário
     */
    void remover(Long id);

    /**
     * Lista todos os usuários com paginação
     * @param pageable configuração de paginação
     * @return página de usuários
     */
    Page<UsuarioResponseDTO> listarTodos(Pageable pageable);

    /**
     * Busca usuários por nome
     * @param nome nome ou parte do nome
     * @param pageable configuração de paginação
     * @return página de usuários
     */
    Page<UsuarioResponseDTO> buscarPorNome(String nome, Pageable pageable);

    /**
     * Busca usuário por email
     * @param email email do usuário
     * @return usuário encontrado
     */
    UsuarioResponseDTO buscarPorEmail(String email);

    /**
     * Busca usuário por CPF
     * @param cpf CPF do usuário
     * @return usuário encontrado
     */
    UsuarioResponseDTO buscarPorCpf(String cpf);

    /**
     * Busca usuário por SIAPE
     * @param siape SIAPE do usuário
     * @return usuário encontrado
     */
    UsuarioResponseDTO buscarPorSiape(String siape);

    /**
     * Busca usuários ativos
     * @param pageable configuração de paginação
     * @return página de usuários ativos
     */
    Page<UsuarioResponseDTO> buscarAtivos(Pageable pageable);

    /**
     * Busca usuários por lotação
     * @param lotacao lotação do usuário
     * @param pageable configuração de paginação
     * @return página de usuários
     */
    Page<UsuarioResponseDTO> buscarPorLotacao(String lotacao, Pageable pageable);

    /**
     * Busca usuários por formação
     * @param formacao formação do usuário
     * @param pageable configuração de paginação
     * @return página de usuários
     */
    Page<UsuarioResponseDTO> buscarPorFormacao(String formacao, Pageable pageable);

    /**
     * Busca usuários que possuem uma função específica
     * @param codigoFuncao código da função
     * @return lista de usuários com a função
     */
    List<UsuarioResponseDTO> buscarPorFuncao(String codigoFuncao);

    /**
     * Busca usuários que possuem uma função específica com paginação
     * @param codigoFuncao código da função
     * @param pageable configuração de paginação
     * @return página de usuários com a função
     */
    Page<UsuarioResponseDTO> buscarPorFuncao(String codigoFuncao, Pageable pageable);

    /**
     * Ativa um usuário
     * @param id identificador do usuário
     * @return usuário ativado
     */
    UsuarioResponseDTO ativar(Long id);

    /**
     * Inativa um usuário
     * @param id identificador do usuário
     * @return usuário inativado
     */
    UsuarioResponseDTO inativar(Long id);

    /**
     * Atribui funções a um usuário
     * @param usuarioId identificador do usuário
     * @param funcaoTagIds identificadores das funções
     * @return usuário com funções atualizadas
     */
    UsuarioResponseDTO atribuirFuncoes(Long usuarioId, Set<Long> funcaoTagIds);

    /**
     * Remove funções de um usuário
     * @param usuarioId identificador do usuário
     * @param funcaoTagIds identificadores das funções a remover
     * @return usuário com funções atualizadas
     */
    UsuarioResponseDTO removerFuncoes(Long usuarioId, Set<Long> funcaoTagIds);

    /**
     * Busca com filtros personalizados
     * @param nome filtro por nome
     * @param email filtro por email
     * @param lotacao filtro por lotação
     * @param formacao filtro por formação
     * @param ativo filtro por status ativo
     * @param pageable configuração de paginação
     * @return página de usuários filtrados
     */
    Page<UsuarioResponseDTO> buscarComFiltros(String nome, String email, String lotacao, 
                                             String formacao, Boolean ativo, Pageable pageable);
}
