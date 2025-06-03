package com.ifms.gad.usuario.repository;

import com.ifms.gad.usuario.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository para operações de banco de dados da entidade Usuario
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    /**
     * Busca usuário por email
     */
    Optional<Usuario> findByEmail(String email);

    /**
     * Busca usuário por CPF
     */
    Optional<Usuario> findByCpf(String cpf);

    /**
     * Busca usuário por SIAPE
     */
    Optional<Usuario> findBySiape(String siape);

    /**
     * Verifica se existe usuário com o email informado
     */
    boolean existsByEmail(String email);

    /**
     * Verifica se existe usuário com o CPF informado
     */
    boolean existsByCpf(String cpf);

    /**
     * Verifica se existe usuário com o SIAPE informado
     */
    boolean existsBySiape(String siape);

    /**
     * Busca usuários ativos
     */
    List<Usuario> findByAtivoTrue();

    /**
     * Busca usuários ativos com paginação
     */
    Page<Usuario> findByAtivoTrue(Pageable pageable);

    /**
     * Busca usuários por nome (parcial, case-insensitive)
     */
    @Query("SELECT u FROM Usuario u WHERE LOWER(u.nome) LIKE LOWER(CONCAT('%', :nome, '%'))")
    Page<Usuario> findByNomeContainingIgnoreCase(@Param("nome") String nome, Pageable pageable);

    /**
     * Busca usuários por lotação
     */
    @Query("SELECT u FROM Usuario u WHERE LOWER(u.lotacao) LIKE LOWER(CONCAT('%', :lotacao, '%'))")
    Page<Usuario> findByLotacaoContainingIgnoreCase(@Param("lotacao") String lotacao, Pageable pageable);

    /**
     * Busca usuários por formação
     */
    @Query("SELECT u FROM Usuario u WHERE LOWER(u.formacao) LIKE LOWER(CONCAT('%', :formacao, '%'))")
    Page<Usuario> findByFormacaoContainingIgnoreCase(@Param("formacao") String formacao, Pageable pageable);

    /**
     * Busca usuários que possuem uma função específica ativa
     */
    @Query("SELECT DISTINCT u FROM Usuario u " +
           "JOIN u.funcaoTags uft " +
           "JOIN uft.funcaoTag ft " +
           "WHERE ft.codigo = :codigoFuncao " +
           "AND uft.ativo = true " +
           "AND u.ativo = true")
    List<Usuario> findByFuncaoTagCodigoAndAtivo(@Param("codigoFuncao") String codigoFuncao);

    /**
     * Busca usuários que possuem uma função específica ativa com paginação
     */
    @Query("SELECT DISTINCT u FROM Usuario u " +
           "JOIN u.funcaoTags uft " +
           "JOIN uft.funcaoTag ft " +
           "WHERE ft.codigo = :codigoFuncao " +
           "AND uft.ativo = true " +
           "AND u.ativo = true")
    Page<Usuario> findByFuncaoTagCodigoAndAtivo(@Param("codigoFuncao") String codigoFuncao, Pageable pageable);

    /**
     * Busca paginada com filtros
     */
    @Query("SELECT u FROM Usuario u WHERE " +
           "(:nome IS NULL OR LOWER(u.nome) LIKE LOWER(CONCAT('%', :nome, '%'))) AND " +
           "(:email IS NULL OR LOWER(u.email) LIKE LOWER(CONCAT('%', :email, '%'))) AND " +
           "(:lotacao IS NULL OR LOWER(u.lotacao) LIKE LOWER(CONCAT('%', :lotacao, '%'))) AND " +
           "(:formacao IS NULL OR LOWER(u.formacao) LIKE LOWER(CONCAT('%', :formacao, '%'))) AND " +
           "(:ativo IS NULL OR u.ativo = :ativo)")
    Page<Usuario> findWithFilters(@Param("nome") String nome,
                                  @Param("email") String email,
                                  @Param("lotacao") String lotacao,
                                  @Param("formacao") String formacao,
                                  @Param("ativo") Boolean ativo,
                                  Pageable pageable);
}
