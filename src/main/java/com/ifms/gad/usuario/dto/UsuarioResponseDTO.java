package com.ifms.gad.usuario.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * DTO de resposta para operações com Usuario
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponseDTO {

    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String siape;
    private String telefone;
    private String formacao;
    private String lotacao;
    private Boolean ativo;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
    
    /**
     * Lista das funções/tags ativas do usuário
     */
    private Set<FuncaoTagResponseDTO> funcaoTags;
}
