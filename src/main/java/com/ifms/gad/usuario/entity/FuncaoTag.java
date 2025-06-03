package com.ifms.gad.usuario.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Entidade que representa uma função/tag que pode ser atribuída a funcionários do IFMS
 * 
 * Exemplos de funções: DOCENTE, COORDENADOR, DIRETOR, TECNICO_ADMINISTRATIVO, 
 * COORDENADOR_CURSO, COORDENADOR_EXTENSAO, etc.
 * 
 * Esta abordagem permite flexibilidade total para diferentes combinações de funções
 * que um funcionário pode exercer simultaneamente.
 */
@Entity
@Table(name = "funcao_tags")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class FuncaoTag implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NotBlank(message = "Código da função é obrigatório")
    @Size(min = 2, max = 30, message = "Código deve ter entre 2 e 30 caracteres")
    @Column(nullable = false, unique = true, length = 30)
    private String codigo;

    @NotBlank(message = "Nome da função é obrigatório")
    @Size(min = 2, max = 100, message = "Nome deve ter entre 2 e 100 caracteres")
    @Column(nullable = false, length = 100)
    private String nome;

    @Size(max = 255, message = "Descrição deve ter no máximo 255 caracteres")
    @Column(length = 255)
    private String descricao;

    @Column(name = "data_criacao", nullable = false, updatable = false)
    private LocalDateTime dataCriacao;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @Column(name = "ativo", nullable = false)
    @Builder.Default
    private Boolean ativo = true;

    @PrePersist
    protected void onCreate() {
        dataCriacao = LocalDateTime.now();
        dataAtualizacao = LocalDateTime.now();
        if (ativo == null) {
            ativo = true;
        }
    }

    @PreUpdate
    protected void onUpdate() {
        dataAtualizacao = LocalDateTime.now();
    }

    /**
     * Método auxiliar para verificar se a função está ativa
     */
    public boolean isAtivo() {
        return ativo != null && ativo;
    }
}
