package com.ifms.gad.usuario.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * DTO de resposta para FuncaoTag
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FuncaoTagResponseDTO {

    private Long id;
    private String codigo;
    private String nome;
    private String descricao;
    private Boolean ativo;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
    
    /**
     * Informações específicas da atribuição (quando usado em UsuarioResponseDTO)
     */
    private LocalDateTime dataAtribuicao;
    private LocalDateTime dataRevogacao;
    private Boolean atribuicaoAtiva;
    private String observacoes;
}
