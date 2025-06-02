package com.ifms.gad.estudante.repository;

import com.ifms.gad.estudante.entity.Estudante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository para operações de banco de dados da entidade Estudante
 */
@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

    /**
     * Busca estudante por email
     */
    Optional<Estudante> findByEmail(String email);    /**
     * Busca estudante por matrícula
     */
    Optional<Estudante> findByMatricula(String matricula);

    /**
     * Busca estudante por CPF
     */
    Optional<Estudante> findByCpf(String cpf);

    /**
     * Verifica se existe estudante com o email informado
     */
    boolean existsByEmail(String email);

    /**
     * Verifica se existe estudante com a matrícula informada
     */
    boolean existsByMatricula(String matricula);

    /**
     * Busca estudantes ativos
     */
    List<Estudante> findByAtivoTrue();

    /**
     * Busca estudantes por curso
     */
    List<Estudante> findByCurso(String curso);    /**
     * Busca estudantes por nome (contendo o texto)
     */
    @Query("SELECT e FROM Estudante e WHERE LOWER(e.nome) LIKE LOWER(CONCAT('%', :nome, '%'))")
    List<Estudante> findByNomeContainingIgnoreCase(@Param("nome") String nome);

    /**
     * Busca paginada de estudantes por nome (contendo o texto)
     */
    @Query("SELECT e FROM Estudante e WHERE LOWER(e.nome) LIKE LOWER(CONCAT('%', :nome, '%'))")
    Page<Estudante> findByNomeContainingIgnoreCase(@Param("nome") String nome, Pageable pageable);

    /**
     * Busca paginada de estudantes ativos
     */
    Page<Estudante> findByAtivoTrue(Pageable pageable);

    /**
     * Busca paginada com filtros
     */
    @Query("SELECT e FROM Estudante e WHERE " +
           "(:nome IS NULL OR LOWER(e.nome) LIKE LOWER(CONCAT('%', :nome, '%'))) AND " +
           "(:email IS NULL OR LOWER(e.email) LIKE LOWER(CONCAT('%', :email, '%'))) AND " +
           "(:curso IS NULL OR LOWER(e.curso) LIKE LOWER(CONCAT('%', :curso, '%'))) AND " +
           "(:ativo IS NULL OR e.ativo = :ativo)")
    Page<Estudante> findWithFilters(@Param("nome") String nome,
                                   @Param("email") String email,
                                   @Param("curso") String curso,
                                   @Param("ativo") Boolean ativo,
                                   Pageable pageable);
}
