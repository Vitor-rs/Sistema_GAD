package com.ifms.gad.usuario.mapper;

import com.ifms.gad.usuario.dto.*;
import com.ifms.gad.usuario.entity.Usuario;
import com.ifms.gad.usuario.entity.UsuarioFuncaoTag;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Mapper simples para conversões entre Usuario e seus DTOs
 */
@Component
public class UsuarioMapperSimple {

    /**
     * Converte UsuarioCreateDTO para Usuario
     */
    public Usuario toEntity(UsuarioCreateDTO createDTO) {
        if (createDTO == null) {
            return null;
        }
        
        return Usuario.builder()
                .nome(createDTO.getNome())
                .email(createDTO.getEmail())
                .cpf(createDTO.getCpf())
                .siape(createDTO.getSiape())
                .telefone(createDTO.getTelefone())
                .formacao(createDTO.getFormacao())
                .lotacao(createDTO.getLotacao())
                .build();
    }

    /**
     * Converte Usuario para UsuarioResponseDTO
     */
    public UsuarioResponseDTO toResponseDTO(Usuario usuario) {
        if (usuario == null) {
            return null;
        }
        
        Set<FuncaoTagResponseDTO> funcaoTagsDTO = null;
        if (usuario.getFuncaoTags() != null) {
            funcaoTagsDTO = usuario.getFuncaoTags().stream()
                    .filter(UsuarioFuncaoTag::isAtivo)
                    .map(this::mapUsuarioFuncaoTagToResponseDTO)
                    .collect(Collectors.toSet());
        }
        
        return UsuarioResponseDTO.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .email(usuario.getEmail())
                .cpf(usuario.getCpf())
                .siape(usuario.getSiape())
                .telefone(usuario.getTelefone())
                .formacao(usuario.getFormacao())
                .lotacao(usuario.getLotacao())
                .ativo(usuario.getAtivo())
                .dataCriacao(usuario.getDataCriacao())
                .dataAtualizacao(usuario.getDataAtualizacao())
                .funcaoTags(funcaoTagsDTO)
                .build();
    }

    /**
     * Atualiza Usuario com dados do UsuarioUpdateDTO
     */
    public void updateEntityFromDTO(UsuarioUpdateDTO updateDTO, Usuario usuario) {
        if (updateDTO == null || usuario == null) {
            return;
        }
        
        if (updateDTO.getNome() != null) {
            usuario.setNome(updateDTO.getNome());
        }
        if (updateDTO.getEmail() != null) {
            usuario.setEmail(updateDTO.getEmail());
        }
        if (updateDTO.getCpf() != null) {
            usuario.setCpf(updateDTO.getCpf());
        }
        if (updateDTO.getSiape() != null) {
            usuario.setSiape(updateDTO.getSiape());
        }
        if (updateDTO.getTelefone() != null) {
            usuario.setTelefone(updateDTO.getTelefone());
        }
        if (updateDTO.getFormacao() != null) {
            usuario.setFormacao(updateDTO.getFormacao());
        }
        if (updateDTO.getLotacao() != null) {
            usuario.setLotacao(updateDTO.getLotacao());
        }
    }

    /**
     * Mapeia UsuarioFuncaoTag para FuncaoTagResponseDTO incluindo dados da atribuição
     */
    private FuncaoTagResponseDTO mapUsuarioFuncaoTagToResponseDTO(UsuarioFuncaoTag usuarioFuncaoTag) {
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
