package com.ifms.gad.estudante.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * DTO para resposta de estudante
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstudanteResponseDTO {

    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;

    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String matricula;
    private String curso;
    private Boolean ativo;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataCriacao;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataAtualizacao;
}
