package com.ifms.gad.usuario.repository;

import com.ifms.gad.usuario.entity.FuncaoTag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository para operações de banco de dados da entidade FuncaoTag
 */
@Repository
public interface FuncaoTagRepository extends JpaRepository<FuncaoTag, Long> {

    /**
     * Busca função por código
     */
    Optional<FuncaoTag> findByCodigo(String codigo);

    /**
     * Verifica se existe função com o código informado
     */
    boolean existsByCodigo(String codigo);

    /**
     * Busca funções ativas
     */
    List<FuncaoTag> findByAtivoTrue();

    /**
     * Busca funções ativas com paginação
     */
    Page<FuncaoTag> findByAtivoTrue(Pageable pageable);

    /**
     * Busca funções por nome (parcial, case-insensitive)
     */
    @Query("SELECT f FROM FuncaoTag f WHERE LOWER(f.nome) LIKE LOWER(CONCAT('%', :nome, '%'))")
    Page<FuncaoTag> findByNomeContainingIgnoreCase(@Param("nome") String nome, Pageable pageable);

    /**
     * Busca funções por código (parcial, case-insensitive)
     */
    @Query("SELECT f FROM FuncaoTag f WHERE LOWER(f.codigo) LIKE LOWER(CONCAT('%', :codigo, '%'))")
    Page<FuncaoTag> findByCodigoContainingIgnoreCase(@Param("codigo") String codigo, Pageable pageable);

    /**
     * Busca paginada com filtros
     */
    @Query("SELECT f FROM FuncaoTag f WHERE " +
           "(:codigo IS NULL OR LOWER(f.codigo) LIKE LOWER(CONCAT('%', :codigo, '%'))) AND " +
           "(:nome IS NULL OR LOWER(f.nome) LIKE LOWER(CONCAT('%', :nome, '%'))) AND " +
           "(:ativo IS NULL OR f.ativo = :ativo)")
    Page<FuncaoTag> findWithFilters(@Param("codigo") String codigo,
                                    @Param("nome") String nome,
                                    @Param("ativo") Boolean ativo,
                                    Pageable pageable);
}
