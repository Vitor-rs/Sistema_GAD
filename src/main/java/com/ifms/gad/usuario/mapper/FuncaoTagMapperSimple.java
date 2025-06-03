package com.ifms.gad.usuario.mapper;

import com.ifms.gad.usuario.dto.FuncaoTagCreateDTO;
import com.ifms.gad.usuario.dto.FuncaoTagResponseDTO;
import com.ifms.gad.usuario.dto.FuncaoTagUpdateDTO;
import com.ifms.gad.usuario.entity.FuncaoTag;
import org.springframework.stereotype.Component;

/**
 * Mapper simples para conversões entre FuncaoTag e seus DTOs
 */
@Component
public class FuncaoTagMapperSimple {

    /**
     * Converte FuncaoTagCreateDTO para FuncaoTag
     */
    public FuncaoTag toEntity(FuncaoTagCreateDTO createDTO) {
        if (createDTO == null) {
            return null;
        }
        
        return FuncaoTag.builder()
                .codigo(createDTO.getCodigo())
                .nome(createDTO.getNome())
                .descricao(createDTO.getDescricao())
                .build();
    }

    /**
     * Converte FuncaoTag para FuncaoTagResponseDTO
     */
    public FuncaoTagResponseDTO toResponseDTO(FuncaoTag funcaoTag) {
        if (funcaoTag == null) {
            return null;
        }
        
        return FuncaoTagResponseDTO.builder()
                .id(funcaoTag.getId())
                .codigo(funcaoTag.getCodigo())
                .nome(funcaoTag.getNome())
                .descricao(funcaoTag.getDescricao())
                .ativo(funcaoTag.getAtivo())
                .dataCriacao(funcaoTag.getDataCriacao())
                .dataAtualizacao(funcaoTag.getDataAtualizacao())
                .build();
    }

    /**
     * Atualiza FuncaoTag com dados do FuncaoTagUpdateDTO
     */
    public void updateEntityFromDTO(FuncaoTagUpdateDTO updateDTO, FuncaoTag funcaoTag) {
        if (updateDTO == null || funcaoTag == null) {
            return;
        }
        
        if (updateDTO.getCodigo() != null) {
            funcaoTag.setCodigo(updateDTO.getCodigo());
        }
        if (updateDTO.getNome() != null) {
            funcaoTag.setNome(updateDTO.getNome());
        }
        if (updateDTO.getDescricao() != null) {
            funcaoTag.setDescricao(updateDTO.getDescricao());
        }
    }
}
