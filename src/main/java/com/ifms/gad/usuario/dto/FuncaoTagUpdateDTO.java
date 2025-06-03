package com.ifms.gad.usuario.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para atualização de FuncaoTag
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FuncaoTagUpdateDTO {

    @Size(min = 2, max = 30, message = "Código deve ter entre 2 e 30 caracteres")
    private String codigo;

    @Size(min = 2, max = 100, message = "Nome deve ter entre 2 e 100 caracteres")
    private String nome;

    @Size(max = 255, message = "Descrição deve ter no máximo 255 caracteres")
    private String descricao;
}
