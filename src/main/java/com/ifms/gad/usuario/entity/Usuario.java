package com.ifms.gad.usuario.entity;

import com.ifms.gad.usuario.entity.UsuarioFuncaoTag;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
import java.util.HashSet;
import java.util.Set;

/**
 * Entidade que representa um funcionário/usuário do IFMS no sistema GAD
 * 
 * Esta entidade representa funcionários do IFMS que podem ter múltiplas funções
 * (docente, coordenador, diretor, técnico, etc.) de forma flexível através de tags.
 */
@Entity
@Table(name = "usuarios")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 2, max = 100, message = "Nome deve ter entre 2 e 100 caracteres")
    @Column(nullable = false, length = 100)
    private String nome;

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email deve ser válido")
    @Size(max = 150, message = "Email deve ter no máximo 150 caracteres")
    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @NotBlank(message = "CPF é obrigatório")
    @Size(min = 11, max = 11, message = "CPF deve ter 11 dígitos")
    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @NotBlank(message = "SIAPE é obrigatório")
    @Size(min = 7, max = 7, message = "SIAPE deve ter 7 dígitos")
    @Column(nullable = false, unique = true, length = 7)
    private String siape;

    @Size(max = 15, message = "Telefone deve ter no máximo 15 caracteres")
    @Column(length = 15)
    private String telefone;

    @Size(max = 50, message = "Formação deve ter no máximo 50 caracteres")
    @Column(length = 50)
    private String formacao;

    @Size(max = 50, message = "Lotação deve ter no máximo 50 caracteres")
    @Column(length = 50)
    private String lotacao;

    @Column(name = "data_criacao", nullable = false, updatable = false)
    private LocalDateTime dataCriacao;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @Column(name = "ativo", nullable = false)
    @Builder.Default
    private Boolean ativo = true;

    /**
     * Relacionamento com as funções/tags que o usuário possui.
     * Um usuário pode ter múltiplas funções (docente, coordenador, diretor, etc.)
     */
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @Builder.Default
    private Set<UsuarioFuncaoTag> funcaoTags = new HashSet<>();

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
     * Método auxiliar para verificar se o usuário está ativo
     */
    public boolean isAtivo() {
        return ativo != null && ativo;
    }

    /**
     * Método auxiliar para adicionar uma função/tag ao usuário
     */
    public void adicionarFuncaoTag(UsuarioFuncaoTag usuarioFuncaoTag) {
        funcaoTags.add(usuarioFuncaoTag);
        usuarioFuncaoTag.setUsuario(this);
    }

    /**
     * Método auxiliar para remover uma função/tag do usuário
     */
    public void removerFuncaoTag(UsuarioFuncaoTag usuarioFuncaoTag) {
        funcaoTags.remove(usuarioFuncaoTag);
        usuarioFuncaoTag.setUsuario(null);
    }
}
