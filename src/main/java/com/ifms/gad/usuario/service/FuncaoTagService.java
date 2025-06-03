package com.ifms.gad.usuario.service;

import com.ifms.gad.usuario.dto.FuncaoTagCreateDTO;
import com.ifms.gad.usuario.dto.FuncaoTagResponseDTO;
import com.ifms.gad.usuario.dto.FuncaoTagUpdateDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Interface de serviço para operações relacionadas a FuncaoTag
 */
public interface FuncaoTagService {

    /**
     * Cria uma nova função/tag
     * @param createDTO dados para criação
     * @return função/tag criada
     */
    FuncaoTagResponseDTO criar(FuncaoTagCreateDTO createDTO);

    /**
     * Busca função/tag por ID
     * @param id identificador da função/tag
     * @return função/tag encontrada
     */
    FuncaoTagResponseDTO buscarPorId(Long id);

    /**
     * Busca função/tag por código
     * @param codigo código da função/tag
     * @return função/tag encontrada
     */
    FuncaoTagResponseDTO buscarPorCodigo(String codigo);

    /**
     * Atualiza dados da função/tag
     * @param id identificador da função/tag
     * @param updateDTO dados para atualização
     * @return função/tag atualizada
     */
    FuncaoTagResponseDTO atualizar(Long id, FuncaoTagUpdateDTO updateDTO);

    /**
     * Remove função/tag do sistema
     * @param id identificador da função/tag
     */
    void remover(Long id);

    /**
     * Lista todas as funções/tags com paginação
     * @param pageable configuração de paginação
     * @return página de funções/tags
     */
    Page<FuncaoTagResponseDTO> listarTodas(Pageable pageable);

    /**
     * Lista todas as funções/tags ativas
     * @return lista de funções/tags ativas
     */
    List<FuncaoTagResponseDTO> listarAtivas();

    /**
     * Busca funções/tags ativas com paginação
     * @param pageable configuração de paginação
     * @return página de funções/tags ativas
     */
    Page<FuncaoTagResponseDTO> buscarAtivas(Pageable pageable);

    /**
     * Busca funções/tags por nome
     * @param nome nome ou parte do nome
     * @param pageable configuração de paginação
     * @return página de funções/tags
     */
    Page<FuncaoTagResponseDTO> buscarPorNome(String nome, Pageable pageable);

    /**
     * Busca funções/tags por código
     * @param codigo código ou parte do código
     * @param pageable configuração de paginação
     * @return página de funções/tags
     */
    Page<FuncaoTagResponseDTO> buscarPorCodigo(String codigo, Pageable pageable);

    /**
     * Ativa uma função/tag
     * @param id identificador da função/tag
     * @return função/tag ativada
     */
    FuncaoTagResponseDTO ativar(Long id);

    /**
     * Inativa uma função/tag
     * @param id identificador da função/tag
     * @return função/tag inativada
     */
    FuncaoTagResponseDTO inativar(Long id);

    /**
     * Busca com filtros personalizados
     * @param codigo filtro por código
     * @param nome filtro por nome
     * @param ativo filtro por status ativo
     * @param pageable configuração de paginação
     * @return página de funções/tags filtradas
     */
    Page<FuncaoTagResponseDTO> buscarComFiltros(String codigo, String nome, Boolean ativo, Pageable pageable);
}
