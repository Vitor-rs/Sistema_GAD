package com.ifms.gad.usuario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Entidade de relacionamento entre Usuario e FuncaoTag
 * 
 * Representa a associação entre um funcionário e suas funções/tags.
 * Permite que um funcionário tenha múltiplas funções simultaneamente.
 * 
 * Exemplo: Um usuário pode ser DOCENTE + COORDENADOR + DIRETOR ao mesmo tempo.
 */
@Entity
@Table(name = "usuario_funcao_tags", 
       uniqueConstraints = @UniqueConstraint(columnNames = {"usuario_id", "funcao_tag_id"}))
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UsuarioFuncaoTag implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "funcao_tag_id", nullable = false)
    private FuncaoTag funcaoTag;

    @Column(name = "data_atribuicao", nullable = false, updatable = false)
    private LocalDateTime dataAtribuicao;

    @Column(name = "data_revogacao")
    private LocalDateTime dataRevogacao;

    @Column(name = "ativo", nullable = false)
    @Builder.Default
    private Boolean ativo = true;

    /**
     * Observações sobre a atribuição da função
     * Ex: "Coordenador do Curso de Informática", "Diretor Geral do Campus"
     */
    @Column(length = 255)
    private String observacoes;

    @PrePersist
    protected void onCreate() {
        dataAtribuicao = LocalDateTime.now();
        if (ativo == null) {
            ativo = true;
        }
    }

    /**
     * Método auxiliar para verificar se a atribuição está ativa
     */
    public boolean isAtivo() {
        return ativo != null && ativo && dataRevogacao == null;
    }

    /**
     * Método para revogar/inativar a função
     */
    public void revogar() {
        this.ativo = false;
        this.dataRevogacao = LocalDateTime.now();
    }

    /**
     * Método para reativar a função
     */
    public void reativar() {
        this.ativo = true;
        this.dataRevogacao = null;
    }
}
