package com.ifms.gad.usuario.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * DTO para criação de Usuario
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioCreateDTO {

    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 2, max = 100, message = "Nome deve ter entre 2 e 100 caracteres")
    private String nome;

    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email deve ser válido")
    @Size(max = 150, message = "Email deve ter no máximo 150 caracteres")
    private String email;

    @NotBlank(message = "CPF é obrigatório")
    @Size(min = 11, max = 11, message = "CPF deve ter 11 dígitos")
    private String cpf;

    @NotBlank(message = "SIAPE é obrigatório")
    @Size(min = 7, max = 7, message = "SIAPE deve ter 7 dígitos")
    private String siape;

    @Size(max = 15, message = "Telefone deve ter no máximo 15 caracteres")
    private String telefone;

    @Size(max = 50, message = "Formação deve ter no máximo 50 caracteres")
    private String formacao;

    @Size(max = 50, message = "Lotação deve ter no máximo 50 caracteres")
    private String lotacao;

    /**
     * IDs das funções/tags a serem atribuídas ao usuário
     */
    private Set<Long> funcaoTagIds;
}
