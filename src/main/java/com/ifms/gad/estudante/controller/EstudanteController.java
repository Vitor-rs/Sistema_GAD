package com.ifms.gad.estudante.controller;

import com.ifms.gad.estudante.dto.EstudanteCreateDTO;
import com.ifms.gad.estudante.dto.EstudanteResponseDTO;
import com.ifms.gad.estudante.dto.EstudanteUpdateDTO;
import com.ifms.gad.estudante.service.EstudanteService;
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

/**
 * Controller REST para gerenciamento de Estudantes
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/estudantes")
@RequiredArgsConstructor
@Tag(name = "Estudantes", description = "API para gerenciamento de estudantes")
public class EstudanteController {
    
    private final EstudanteService estudanteService;
    
    @Operation(summary = "Criar um novo estudante", description = "Cria um novo estudante no sistema")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Estudante criado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos"),
        @ApiResponse(responseCode = "409", description = "Email ou CPF já existente")
    })
    @PostMapping
    public ResponseEntity<EstudanteResponseDTO> criar(
            @Valid @RequestBody EstudanteCreateDTO createDTO) {
        log.info("Recebida requisição para criar estudante: {}", createDTO.getEmail());
        
        EstudanteResponseDTO estudante = estudanteService.criar(createDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(estudante);
    }
    
    @Operation(summary = "Buscar estudante por ID", description = "Busca um estudante específico pelo ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Estudante encontrado"),
        @ApiResponse(responseCode = "404", description = "Estudante não encontrado")
    })
    @GetMapping("/{id}")
    public ResponseEntity<EstudanteResponseDTO> buscarPorId(
            @Parameter(description = "ID do estudante") @PathVariable Long id) {
        log.info("Recebida requisição para buscar estudante por ID: {}", id);
        
        EstudanteResponseDTO estudante = estudanteService.buscarPorId(id);
        return ResponseEntity.ok(estudante);
    }
    
    @Operation(summary = "Atualizar estudante", description = "Atualiza os dados de um estudante existente")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Estudante atualizado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos"),
        @ApiResponse(responseCode = "404", description = "Estudante não encontrado"),
        @ApiResponse(responseCode = "409", description = "Email ou CPF já existente")
    })
    @PutMapping("/{id}")
    public ResponseEntity<EstudanteResponseDTO> atualizar(
            @Parameter(description = "ID do estudante") @PathVariable Long id,
            @Valid @RequestBody EstudanteUpdateDTO updateDTO) {
        log.info("Recebida requisição para atualizar estudante ID: {}", id);
        
        EstudanteResponseDTO estudante = estudanteService.atualizar(id, updateDTO);
        return ResponseEntity.ok(estudante);
    }
    
    @Operation(summary = "Remover estudante", description = "Remove um estudante do sistema")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Estudante removido com sucesso"),
        @ApiResponse(responseCode = "404", description = "Estudante não encontrado")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(
            @Parameter(description = "ID do estudante") @PathVariable Long id) {
        log.info("Recebida requisição para remover estudante ID: {}", id);
        
        estudanteService.remover(id);
        return ResponseEntity.noContent().build();
    }
    
    @Operation(summary = "Listar todos os estudantes", description = "Lista todos os estudantes com paginação")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de estudantes retornada com sucesso")
    })
    @GetMapping
    public ResponseEntity<Page<EstudanteResponseDTO>> listarTodos(
            @PageableDefault(size = 20, sort = "nome") Pageable pageable) {
        log.info("Recebida requisição para listar todos os estudantes - Página: {}, Tamanho: {}", 
                pageable.getPageNumber(), pageable.getPageSize());
        
        Page<EstudanteResponseDTO> estudantes = estudanteService.listarTodos(pageable);
        return ResponseEntity.ok(estudantes);
    }
    
    @Operation(summary = "Buscar estudantes por nome", description = "Busca estudantes pelo nome com paginação")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de estudantes retornada com sucesso")
    })
    @GetMapping("/buscar-por-nome")
    public ResponseEntity<Page<EstudanteResponseDTO>> buscarPorNome(
            @Parameter(description = "Nome ou parte do nome") @RequestParam String nome,
            @PageableDefault(size = 20, sort = "nome") Pageable pageable) {
        log.info("Recebida requisição para buscar estudantes por nome: {}", nome);
        
        Page<EstudanteResponseDTO> estudantes = estudanteService.buscarPorNome(nome, pageable);
        return ResponseEntity.ok(estudantes);
    }
    
    @Operation(summary = "Buscar estudante por email", description = "Busca um estudante específico pelo email")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Estudante encontrado"),
        @ApiResponse(responseCode = "404", description = "Estudante não encontrado")
    })
    @GetMapping("/buscar-por-email")
    public ResponseEntity<EstudanteResponseDTO> buscarPorEmail(
            @Parameter(description = "Email do estudante") @RequestParam String email) {
        log.info("Recebida requisição para buscar estudante por email: {}", email);
        
        EstudanteResponseDTO estudante = estudanteService.buscarPorEmail(email);
        return ResponseEntity.ok(estudante);
    }
    
    @Operation(summary = "Buscar estudante por CPF", description = "Busca um estudante específico pelo CPF")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Estudante encontrado"),
        @ApiResponse(responseCode = "404", description = "Estudante não encontrado")
    })
    @GetMapping("/buscar-por-cpf")
    public ResponseEntity<EstudanteResponseDTO> buscarPorCpf(
            @Parameter(description = "CPF do estudante") @RequestParam String cpf) {
        log.info("Recebida requisição para buscar estudante por CPF: {}", cpf);
        
        EstudanteResponseDTO estudante = estudanteService.buscarPorCpf(cpf);
        return ResponseEntity.ok(estudante);
    }
    
    @Operation(summary = "Listar estudantes ativos", description = "Lista apenas os estudantes ativos com paginação")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de estudantes ativos retornada com sucesso")
    })
    @GetMapping("/ativos")
    public ResponseEntity<Page<EstudanteResponseDTO>> buscarAtivos(
            @PageableDefault(size = 20, sort = "nome") Pageable pageable) {
        log.info("Recebida requisição para listar estudantes ativos");
        
        Page<EstudanteResponseDTO> estudantes = estudanteService.buscarAtivos(pageable);
        return ResponseEntity.ok(estudantes);
    }
    
    @Operation(summary = "Ativar estudante", description = "Ativa um estudante inativo")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Estudante ativado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Estudante já está ativo"),
        @ApiResponse(responseCode = "404", description = "Estudante não encontrado")
    })
    @PatchMapping("/{id}/ativar")
    public ResponseEntity<EstudanteResponseDTO> ativar(
            @Parameter(description = "ID do estudante") @PathVariable Long id) {
        log.info("Recebida requisição para ativar estudante ID: {}", id);
        
        EstudanteResponseDTO estudante = estudanteService.ativar(id);
        return ResponseEntity.ok(estudante);
    }
    
    @Operation(summary = "Inativar estudante", description = "Inativa um estudante ativo")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Estudante inativado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Estudante já está inativo"),
        @ApiResponse(responseCode = "404", description = "Estudante não encontrado")
    })
    @PatchMapping("/{id}/inativar")
    public ResponseEntity<EstudanteResponseDTO> inativar(
            @Parameter(description = "ID do estudante") @PathVariable Long id) {
        log.info("Recebida requisição para inativar estudante ID: {}", id);
        
        EstudanteResponseDTO estudante = estudanteService.inativar(id);
        return ResponseEntity.ok(estudante);
    }
}
