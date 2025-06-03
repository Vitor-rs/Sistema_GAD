package com.ifms.gad.usuario.mapper;

import com.ifms.gad.usuario.dto.FuncaoTagCreateDTO;
import com.ifms.gad.usuario.dto.FuncaoTagResponseDTO;
import com.ifms.gad.usuario.dto.FuncaoTagUpdateDTO;
import com.ifms.gad.usuario.entity.FuncaoTag;
import org.mapstruct.*;

/**
 * Mapper para conversões entre FuncaoTag e seus DTOs
 */
@Mapper(componentModel = "spring")
public interface FuncaoTagMapper {

    /**
     * Converte FuncaoTagCreateDTO para FuncaoTag
     */    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    @Mapping(target = "dataAtualizacao", ignore = true)
    @Mapping(target = "ativo", ignore = true)
    FuncaoTag toEntity(FuncaoTagCreateDTO createDTO);

    /**
     * Converte FuncaoTag para FuncaoTagResponseDTO
     */
    @Mapping(target = "dataAtribuicao", ignore = true)
    @Mapping(target = "dataRevogacao", ignore = true)
    @Mapping(target = "atribuicaoAtiva", ignore = true)
    @Mapping(target = "observacoes", ignore = true)
    FuncaoTagResponseDTO toResponseDTO(FuncaoTag funcaoTag);

    /**
     * Atualiza FuncaoTag com dados do FuncaoTagUpdateDTO
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    @Mapping(target = "dataAtualizacao", ignore = true)
    @Mapping(target = "ativo", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDTO(FuncaoTagUpdateDTO updateDTO, @MappingTarget FuncaoTag funcaoTag);
}
