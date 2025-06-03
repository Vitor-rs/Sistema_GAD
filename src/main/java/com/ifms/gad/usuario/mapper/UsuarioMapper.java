package com.ifms.gad.usuario.mapper;

import com.ifms.gad.usuario.dto.*;
import com.ifms.gad.usuario.entity.Usuario;
import com.ifms.gad.usuario.entity.UsuarioFuncaoTag;
import org.mapstruct.*;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Mapper para conversões entre Usuario e seus DTOs
 */
@Mapper(componentModel = "spring", uses = {FuncaoTagMapper.class})
public interface UsuarioMapper {

    /**
     * Converte UsuarioCreateDTO para Usuario
     */    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    @Mapping(target = "dataAtualizacao", ignore = true)
    @Mapping(target = "ativo", ignore = true)
    @Mapping(target = "funcaoTags", ignore = true)
    Usuario toEntity(UsuarioCreateDTO createDTO);

    /**
     * Converte Usuario para UsuarioResponseDTO
     */
    @Mapping(target = "funcaoTags", source = "funcaoTags", qualifiedByName = "mapFuncaoTagsAtivas")
    UsuarioResponseDTO toResponseDTO(Usuario usuario);

    /**
     * Atualiza Usuario com dados do UsuarioUpdateDTO
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    @Mapping(target = "dataAtualizacao", ignore = true)
    @Mapping(target = "ativo", ignore = true)
    @Mapping(target = "funcaoTags", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDTO(UsuarioUpdateDTO updateDTO, @MappingTarget Usuario usuario);

    /**
     * Mapeia apenas as funções/tags ativas do usuário
     */
    @Named("mapFuncaoTagsAtivas")
    default Set<FuncaoTagResponseDTO> mapFuncaoTagsAtivas(Set<UsuarioFuncaoTag> usuarioFuncaoTags) {
        if (usuarioFuncaoTags == null) {
            return null;
        }
        
        return usuarioFuncaoTags.stream()
                .filter(UsuarioFuncaoTag::isAtivo)
                .map(this::mapUsuarioFuncaoTagToResponseDTO)
                .collect(Collectors.toSet());
    }

    /**
     * Mapeia UsuarioFuncaoTag para FuncaoTagResponseDTO incluindo dados da atribuição
     */
    default FuncaoTagResponseDTO mapUsuarioFuncaoTagToResponseDTO(UsuarioFuncaoTag usuarioFuncaoTag) {
        if (usuarioFuncaoTag == null || usuarioFuncaoTag.getFuncaoTag() == null) {
            return null;
        }
        
        return FuncaoTagResponseDTO.builder()
                .id(usuarioFuncaoTag.getFuncaoTag().getId())
                .codigo(usuarioFuncaoTag.getFuncaoTag().getCodigo())
                .nome(usuarioFuncaoTag.getFuncaoTag().getNome())
                .descricao(usuarioFuncaoTag.getFuncaoTag().getDescricao())
                .ativo(usuarioFuncaoTag.getFuncaoTag().getAtivo())
                .dataCriacao(usuarioFuncaoTag.getFuncaoTag().getDataCriacao())
                .dataAtualizacao(usuarioFuncaoTag.getFuncaoTag().getDataAtualizacao())
                .dataAtribuicao(usuarioFuncaoTag.getDataAtribuicao())
                .dataRevogacao(usuarioFuncaoTag.getDataRevogacao())
                .atribuicaoAtiva(usuarioFuncaoTag.isAtivo())
                .observacoes(usuarioFuncaoTag.getObservacoes())
                .build();
    }
}
