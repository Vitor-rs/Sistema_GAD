package com.ifms.gad.usuario.controller;

import com.ifms.gad.usuario.dto.FuncaoTagCreateDTO;
import com.ifms.gad.usuario.dto.FuncaoTagResponseDTO;
import com.ifms.gad.usuario.dto.FuncaoTagUpdateDTO;
import com.ifms.gad.usuario.service.FuncaoTagService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para operações relacionadas às funções/tags dos usuários
 */
@Slf4j
@RestController
@RequestMapping("/api/funcoes")
@RequiredArgsConstructor
@Tag(name = "Funções/Tags", description = "Operações relacionadas às funções e tags dos usuários")
public class FuncaoTagController {

    private final FuncaoTagService funcaoTagService;

    @Operation(summary = "Criar nova função/tag", description = "Cria uma nova função/tag no sistema")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Função/tag criada com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos"),
        @ApiResponse(responseCode = "409", description = "Código já em uso")
    })
    @PostMapping
    public ResponseEntity<FuncaoTagResponseDTO> criar(@Valid @RequestBody FuncaoTagCreateDTO createDTO) {
        log.info("Requisição para criar função/tag com código: {}", createDTO.getCodigo());
        FuncaoTagResponseDTO funcaoTag = funcaoTagService.criar(createDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcaoTag);
    }

    @Operation(summary = "Buscar função/tag por ID", description = "Busca uma função/tag específica pelo seu identificador")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Função/tag encontrada"),
        @ApiResponse(responseCode = "404", description = "Função/tag não encontrada")
    })
    @GetMapping("/{id}")
    public ResponseEntity<FuncaoTagResponseDTO> buscarPorId(
            @Parameter(description = "ID da função/tag") @PathVariable Long id) {
        log.info("Requisição para buscar função/tag por ID: {}", id);
        FuncaoTagResponseDTO funcaoTag = funcaoTagService.buscarPorId(id);
        return ResponseEntity.ok(funcaoTag);
    }

    @Operation(summary = "Buscar função/tag por código", description = "Busca uma função/tag pelo seu código")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Função/tag encontrada"),
        @ApiResponse(responseCode = "404", description = "Função/tag não encontrada")
    })
    @GetMapping("/buscar/codigo")
    public ResponseEntity<FuncaoTagResponseDTO> buscarPorCodigo(
            @Parameter(description = "Código da função/tag") @RequestParam String codigo) {
        log.info("Requisição para buscar função/tag por código: {}", codigo);
        FuncaoTagResponseDTO funcaoTag = funcaoTagService.buscarPorCodigo(codigo);
        return ResponseEntity.ok(funcaoTag);
    }

    @Operation(summary = "Atualizar função/tag", description = "Atualiza os dados de uma função/tag existente")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Função/tag atualizada com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos"),
        @ApiResponse(responseCode = "404", description = "Função/tag não encontrada"),
        @ApiResponse(responseCode = "409", description = "Código já em uso")
    })
    @PutMapping("/{id}")
    public ResponseEntity<FuncaoTagResponseDTO> atualizar(
            @Parameter(description = "ID da função/tag") @PathVariable Long id,
            @Valid @RequestBody FuncaoTagUpdateDTO updateDTO) {
        log.info("Requisição para atualizar função/tag ID: {}", id);
        FuncaoTagResponseDTO funcaoTag = funcaoTagService.atualizar(id, updateDTO);
        return ResponseEntity.ok(funcaoTag);
    }

    @Operation(summary = "Remover função/tag", description = "Remove uma função/tag do sistema")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Função/tag removida com sucesso"),
        @ApiResponse(responseCode = "404", description = "Função/tag não encontrada"),
        @ApiResponse(responseCode = "409", description = "Função/tag em uso, não pode ser removida")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(
            @Parameter(description = "ID da função/tag") @PathVariable Long id) {
        log.info("Requisição para remover função/tag ID: {}", id);
        funcaoTagService.remover(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Listar todas as funções/tags", description = "Lista todas as funções/tags com paginação")
    @ApiResponse(responseCode = "200", description = "Lista de funções/tags retornada com sucesso")
    @GetMapping
    public ResponseEntity<Page<FuncaoTagResponseDTO>> listarTodas(
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para listar todas as funções/tags");
        Page<FuncaoTagResponseDTO> funcaoTags = funcaoTagService.listarTodas(pageable);
        return ResponseEntity.ok(funcaoTags);
    }

    @Operation(summary = "Listar funções/tags ativas", description = "Lista todas as funções/tags ativas (sem paginação)")
    @ApiResponse(responseCode = "200", description = "Lista de funções/tags ativas retornada com sucesso")
    @GetMapping("/ativas")
    public ResponseEntity<List<FuncaoTagResponseDTO>> listarAtivas() {
        log.info("Requisição para listar funções/tags ativas");
        List<FuncaoTagResponseDTO> funcaoTags = funcaoTagService.listarAtivas();
        return ResponseEntity.ok(funcaoTags);
    }

    @Operation(summary = "Buscar funções/tags ativas com paginação", description = "Lista todas as funções/tags ativas com paginação")
    @ApiResponse(responseCode = "200", description = "Página de funções/tags ativas retornada com sucesso")
    @GetMapping("/ativas/paginado")
    public ResponseEntity<Page<FuncaoTagResponseDTO>> buscarAtivasPaginado(
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para buscar funções/tags ativas com paginação");
        Page<FuncaoTagResponseDTO> funcaoTags = funcaoTagService.buscarAtivas(pageable);
        return ResponseEntity.ok(funcaoTags);
    }

    @Operation(summary = "Buscar funções/tags por nome", description = "Busca funções/tags que contenham o nome informado")
    @ApiResponse(responseCode = "200", description = "Funções/tags encontradas")
    @GetMapping("/buscar/nome")
    public ResponseEntity<Page<FuncaoTagResponseDTO>> buscarPorNome(
            @Parameter(description = "Nome ou parte do nome") @RequestParam String nome,
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para buscar funções/tags por nome: {}", nome);
        Page<FuncaoTagResponseDTO> funcaoTags = funcaoTagService.buscarPorNome(nome, pageable);
        return ResponseEntity.ok(funcaoTags);
    }

    @Operation(summary = "Buscar funções/tags por código", description = "Busca funções/tags que contenham o código informado")
    @ApiResponse(responseCode = "200", description = "Funções/tags encontradas")
    @GetMapping("/buscar/codigo/like")
    public ResponseEntity<Page<FuncaoTagResponseDTO>> buscarPorCodigoLike(
            @Parameter(description = "Código ou parte do código") @RequestParam String codigo,
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para buscar funções/tags por código (like): {}", codigo);
        Page<FuncaoTagResponseDTO> funcaoTags = funcaoTagService.buscarPorCodigo(codigo, pageable);
        return ResponseEntity.ok(funcaoTags);
    }

    @Operation(summary = "Ativar função/tag", description = "Ativa uma função/tag inativa")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Função/tag ativada com sucesso"),
        @ApiResponse(responseCode = "400", description = "Função/tag já está ativa"),
        @ApiResponse(responseCode = "404", description = "Função/tag não encontrada")
    })
    @PatchMapping("/{id}/ativar")
    public ResponseEntity<FuncaoTagResponseDTO> ativar(
            @Parameter(description = "ID da função/tag") @PathVariable Long id) {
        log.info("Requisição para ativar função/tag ID: {}", id);
        FuncaoTagResponseDTO funcaoTag = funcaoTagService.ativar(id);
        return ResponseEntity.ok(funcaoTag);
    }

    @Operation(summary = "Inativar função/tag", description = "Inativa uma função/tag ativa")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Função/tag inativada com sucesso"),
        @ApiResponse(responseCode = "400", description = "Função/tag já está inativa"),
        @ApiResponse(responseCode = "404", description = "Função/tag não encontrada")
    })
    @PatchMapping("/{id}/inativar")
    public ResponseEntity<FuncaoTagResponseDTO> inativar(
            @Parameter(description = "ID da função/tag") @PathVariable Long id) {
        log.info("Requisição para inativar função/tag ID: {}", id);
        FuncaoTagResponseDTO funcaoTag = funcaoTagService.inativar(id);
        return ResponseEntity.ok(funcaoTag);
    }

    @Operation(summary = "Buscar com filtros", description = "Busca funções/tags aplicando múltiplos filtros")
    @ApiResponse(responseCode = "200", description = "Funções/tags encontradas")
    @GetMapping("/buscar/filtros")
    public ResponseEntity<Page<FuncaoTagResponseDTO>> buscarComFiltros(
            @Parameter(description = "Filtro por código") @RequestParam(required = false) String codigo,
            @Parameter(description = "Filtro por nome") @RequestParam(required = false) String nome,
            @Parameter(description = "Filtro por status ativo") @RequestParam(required = false) Boolean ativo,
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para buscar funções/tags com filtros");
        Page<FuncaoTagResponseDTO> funcaoTags = funcaoTagService.buscarComFiltros(codigo, nome, ativo, pageable);
        return ResponseEntity.ok(funcaoTags);
    }
}
