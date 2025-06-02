package com.ifms.gad.estudante.mapper;

import com.ifms.gad.estudante.dto.EstudanteCreateDTO;
import com.ifms.gad.estudante.dto.EstudanteResponseDTO;
import com.ifms.gad.estudante.dto.EstudanteUpdateDTO;
import com.ifms.gad.estudante.entity.Estudante;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Mapper para conversão entre DTOs e entidades de Estudante
 */
@Component
public class EstudanteMapper {

    /**
     * Converte CreateDTO para entidade
     */
    public Estudante toEntity(EstudanteCreateDTO dto) {
        if (dto == null) {
            return null;
        }

        return Estudante.builder()
                .nome(dto.getNome())
                .email(dto.getEmail())
                .cpf(dto.getCpf())
                .telefone(dto.getTelefone())
                .dataNascimento(dto.getDataNascimento())
                .endereco(dto.getEndereco())
                .cidade(dto.getCidade())
                .estado(dto.getEstado())
                .cep(dto.getCep())
                .ativo(true) // Novo estudante sempre inicia ativo
                .build();
    }

    /**
     * Converte entidade para ResponseDTO
     */
    public EstudanteResponseDTO toResponseDTO(Estudante entity) {
        if (entity == null) {
            return null;
        }

        return EstudanteResponseDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .email(entity.getEmail())
                .cpf(entity.getCpf())
                .telefone(entity.getTelefone())
                .dataNascimento(entity.getDataNascimento())
                .endereco(entity.getEndereco())
                .cidade(entity.getCidade())
                .estado(entity.getEstado())
                .cep(entity.getCep())
                .ativo(entity.isAtivo())
                .dataCriacao(entity.getDataCriacao())
                .dataAtualizacao(entity.getDataAtualizacao())
                .build();
    }

    /**
     * Atualiza entidade com dados do UpdateDTO
     */
    public void updateEntityFromDTO(EstudanteUpdateDTO dto, Estudante entity) {
        if (entity == null || dto == null) {
            return;
        }

        if (dto.getNome() != null) {
            entity.setNome(dto.getNome());
        }
        if (dto.getEmail() != null) {
            entity.setEmail(dto.getEmail());
        }
        if (dto.getCpf() != null) {
            entity.setCpf(dto.getCpf());
        }
        if (dto.getTelefone() != null) {
            entity.setTelefone(dto.getTelefone());
        }
        if (dto.getDataNascimento() != null) {
            entity.setDataNascimento(dto.getDataNascimento());
        }
        if (dto.getEndereco() != null) {
            entity.setEndereco(dto.getEndereco());
        }
        if (dto.getCidade() != null) {
            entity.setCidade(dto.getCidade());
        }
        if (dto.getEstado() != null) {
            entity.setEstado(dto.getEstado());
        }
        if (dto.getCep() != null) {
            entity.setCep(dto.getCep());
        }
    }

    /**
     * Converte lista de entidades para lista de ResponseDTOs
     */
    public List<EstudanteResponseDTO> toResponseDTOList(List<Estudante> entities) {
        if (entities == null) {
            return List.of();
        }

        return entities.stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }
}
