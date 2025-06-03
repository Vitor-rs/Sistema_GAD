package com.ifms.gad.usuario.controller;

import com.ifms.gad.usuario.dto.UsuarioCreateDTO;
import com.ifms.gad.usuario.dto.UsuarioResponseDTO;
import com.ifms.gad.usuario.dto.UsuarioUpdateDTO;
import com.ifms.gad.usuario.service.UsuarioService;
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
import java.util.Set;

/**
 * Controlador REST para operações relacionadas a usuários/funcionários
 */
@Slf4j
@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
@Tag(name = "Usuários", description = "Operações relacionadas aos usuários/funcionários do IFMS")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Operation(summary = "Criar novo usuário", description = "Cria um novo usuário no sistema")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Usuário criado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos"),
        @ApiResponse(responseCode = "409", description = "Email, CPF ou SIAPE já em uso")
    })
    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> criar(@Valid @RequestBody UsuarioCreateDTO createDTO) {
        log.info("Requisição para criar usuário com email: {}", createDTO.getEmail());
        UsuarioResponseDTO usuario = usuarioService.criar(createDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @Operation(summary = "Buscar usuário por ID", description = "Busca um usuário específico pelo seu identificador")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Usuário encontrado"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
    })
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> buscarPorId(
            @Parameter(description = "ID do usuário") @PathVariable Long id) {
        log.info("Requisição para buscar usuário por ID: {}", id);
        UsuarioResponseDTO usuario = usuarioService.buscarPorId(id);
        return ResponseEntity.ok(usuario);
    }

    @Operation(summary = "Atualizar usuário", description = "Atualiza os dados de um usuário existente")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Usuário atualizado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado"),
        @ApiResponse(responseCode = "409", description = "Email, CPF ou SIAPE já em uso")
    })
    @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> atualizar(
            @Parameter(description = "ID do usuário") @PathVariable Long id,
            @Valid @RequestBody UsuarioUpdateDTO updateDTO) {
        log.info("Requisição para atualizar usuário ID: {}", id);
        UsuarioResponseDTO usuario = usuarioService.atualizar(id, updateDTO);
        return ResponseEntity.ok(usuario);
    }

    @Operation(summary = "Remover usuário", description = "Remove um usuário do sistema")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Usuário removido com sucesso"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(
            @Parameter(description = "ID do usuário") @PathVariable Long id) {
        log.info("Requisição para remover usuário ID: {}", id);
        usuarioService.remover(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Listar todos os usuários", description = "Lista todos os usuários com paginação")
    @ApiResponse(responseCode = "200", description = "Lista de usuários retornada com sucesso")
    @GetMapping
    public ResponseEntity<Page<UsuarioResponseDTO>> listarTodos(
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para listar todos os usuários");
        Page<UsuarioResponseDTO> usuarios = usuarioService.listarTodos(pageable);
        return ResponseEntity.ok(usuarios);
    }

    @Operation(summary = "Buscar usuários por nome", description = "Busca usuários que contenham o nome informado")
    @ApiResponse(responseCode = "200", description = "Usuários encontrados")
    @GetMapping("/buscar/nome")
    public ResponseEntity<Page<UsuarioResponseDTO>> buscarPorNome(
            @Parameter(description = "Nome ou parte do nome") @RequestParam String nome,
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para buscar usuários por nome: {}", nome);
        Page<UsuarioResponseDTO> usuarios = usuarioService.buscarPorNome(nome, pageable);
        return ResponseEntity.ok(usuarios);
    }

    @Operation(summary = "Buscar usuário por email", description = "Busca um usuário pelo seu email")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Usuário encontrado"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
    })
    @GetMapping("/buscar/email")
    public ResponseEntity<UsuarioResponseDTO> buscarPorEmail(
            @Parameter(description = "Email do usuário") @RequestParam String email) {
        log.info("Requisição para buscar usuário por email: {}", email);
        UsuarioResponseDTO usuario = usuarioService.buscarPorEmail(email);
        return ResponseEntity.ok(usuario);
    }

    @Operation(summary = "Buscar usuário por CPF", description = "Busca um usuário pelo seu CPF")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Usuário encontrado"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
    })
    @GetMapping("/buscar/cpf")
    public ResponseEntity<UsuarioResponseDTO> buscarPorCpf(
            @Parameter(description = "CPF do usuário") @RequestParam String cpf) {
        log.info("Requisição para buscar usuário por CPF: {}", cpf);
        UsuarioResponseDTO usuario = usuarioService.buscarPorCpf(cpf);
        return ResponseEntity.ok(usuario);
    }

    @Operation(summary = "Buscar usuário por SIAPE", description = "Busca um usuário pelo seu código SIAPE")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Usuário encontrado"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
    })
    @GetMapping("/buscar/siape")
    public ResponseEntity<UsuarioResponseDTO> buscarPorSiape(
            @Parameter(description = "SIAPE do usuário") @RequestParam String siape) {
        log.info("Requisição para buscar usuário por SIAPE: {}", siape);
        UsuarioResponseDTO usuario = usuarioService.buscarPorSiape(siape);
        return ResponseEntity.ok(usuario);
    }

    @Operation(summary = "Buscar usuários ativos", description = "Lista todos os usuários ativos com paginação")
    @ApiResponse(responseCode = "200", description = "Lista de usuários ativos retornada com sucesso")
    @GetMapping("/ativos")
    public ResponseEntity<Page<UsuarioResponseDTO>> buscarAtivos(
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para buscar usuários ativos");
        Page<UsuarioResponseDTO> usuarios = usuarioService.buscarAtivos(pageable);
        return ResponseEntity.ok(usuarios);
    }

    @Operation(summary = "Buscar usuários por lotação", description = "Busca usuários por lotação")
    @ApiResponse(responseCode = "200", description = "Usuários encontrados")
    @GetMapping("/buscar/lotacao")
    public ResponseEntity<Page<UsuarioResponseDTO>> buscarPorLotacao(
            @Parameter(description = "Lotação do usuário") @RequestParam String lotacao,
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para buscar usuários por lotação: {}", lotacao);
        Page<UsuarioResponseDTO> usuarios = usuarioService.buscarPorLotacao(lotacao, pageable);
        return ResponseEntity.ok(usuarios);
    }

    @Operation(summary = "Buscar usuários por formação", description = "Busca usuários por formação")
    @ApiResponse(responseCode = "200", description = "Usuários encontrados")
    @GetMapping("/buscar/formacao")
    public ResponseEntity<Page<UsuarioResponseDTO>> buscarPorFormacao(
            @Parameter(description = "Formação do usuário") @RequestParam String formacao,
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para buscar usuários por formação: {}", formacao);
        Page<UsuarioResponseDTO> usuarios = usuarioService.buscarPorFormacao(formacao, pageable);
        return ResponseEntity.ok(usuarios);
    }

    @Operation(summary = "Buscar usuários por função", description = "Busca usuários que possuem uma função específica")
    @ApiResponse(responseCode = "200", description = "Usuários encontrados")
    @GetMapping("/buscar/funcao")
    public ResponseEntity<List<UsuarioResponseDTO>> buscarPorFuncao(
            @Parameter(description = "Código da função") @RequestParam String codigoFuncao) {
        log.info("Requisição para buscar usuários por função: {}", codigoFuncao);
        List<UsuarioResponseDTO> usuarios = usuarioService.buscarPorFuncao(codigoFuncao);
        return ResponseEntity.ok(usuarios);
    }

    @Operation(summary = "Buscar usuários por função com paginação", description = "Busca usuários que possuem uma função específica com paginação")
    @ApiResponse(responseCode = "200", description = "Usuários encontrados")
    @GetMapping("/buscar/funcao/paginado")
    public ResponseEntity<Page<UsuarioResponseDTO>> buscarPorFuncaoPaginado(
            @Parameter(description = "Código da função") @RequestParam String codigoFuncao,
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para buscar usuários por função com paginação: {}", codigoFuncao);
        Page<UsuarioResponseDTO> usuarios = usuarioService.buscarPorFuncao(codigoFuncao, pageable);
        return ResponseEntity.ok(usuarios);
    }

    @Operation(summary = "Ativar usuário", description = "Ativa um usuário inativo")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Usuário ativado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Usuário já está ativo"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
    })
    @PatchMapping("/{id}/ativar")
    public ResponseEntity<UsuarioResponseDTO> ativar(
            @Parameter(description = "ID do usuário") @PathVariable Long id) {
        log.info("Requisição para ativar usuário ID: {}", id);
        UsuarioResponseDTO usuario = usuarioService.ativar(id);
        return ResponseEntity.ok(usuario);
    }

    @Operation(summary = "Inativar usuário", description = "Inativa um usuário ativo")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Usuário inativado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Usuário já está inativo"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
    })
    @PatchMapping("/{id}/inativar")
    public ResponseEntity<UsuarioResponseDTO> inativar(
            @Parameter(description = "ID do usuário") @PathVariable Long id) {
        log.info("Requisição para inativar usuário ID: {}", id);
        UsuarioResponseDTO usuario = usuarioService.inativar(id);
        return ResponseEntity.ok(usuario);
    }

    @Operation(summary = "Atribuir funções", description = "Atribui funções/tags a um usuário")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Funções atribuídas com sucesso"),
        @ApiResponse(responseCode = "404", description = "Usuário ou função não encontrada"),
        @ApiResponse(responseCode = "400", description = "Função inativa não pode ser atribuída")
    })
    @PostMapping("/{id}/funcoes")
    public ResponseEntity<UsuarioResponseDTO> atribuirFuncoes(
            @Parameter(description = "ID do usuário") @PathVariable Long id,
            @Parameter(description = "IDs das funções a atribuir") @RequestBody Set<Long> funcaoTagIds) {
        log.info("Requisição para atribuir funções ao usuário ID: {}", id);
        UsuarioResponseDTO usuario = usuarioService.atribuirFuncoes(id, funcaoTagIds);
        return ResponseEntity.ok(usuario);
    }

    @Operation(summary = "Remover funções", description = "Remove funções/tags de um usuário")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Funções removidas com sucesso"),
        @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
    })
    @DeleteMapping("/{id}/funcoes")
    public ResponseEntity<UsuarioResponseDTO> removerFuncoes(
            @Parameter(description = "ID do usuário") @PathVariable Long id,
            @Parameter(description = "IDs das funções a remover") @RequestBody Set<Long> funcaoTagIds) {
        log.info("Requisição para remover funções do usuário ID: {}", id);
        UsuarioResponseDTO usuario = usuarioService.removerFuncoes(id, funcaoTagIds);
        return ResponseEntity.ok(usuario);
    }

    @Operation(summary = "Buscar com filtros", description = "Busca usuários aplicando múltiplos filtros")
    @ApiResponse(responseCode = "200", description = "Usuários encontrados")
    @GetMapping("/buscar/filtros")
    public ResponseEntity<Page<UsuarioResponseDTO>> buscarComFiltros(
            @Parameter(description = "Filtro por nome") @RequestParam(required = false) String nome,
            @Parameter(description = "Filtro por email") @RequestParam(required = false) String email,
            @Parameter(description = "Filtro por lotação") @RequestParam(required = false) String lotacao,
            @Parameter(description = "Filtro por formação") @RequestParam(required = false) String formacao,
            @Parameter(description = "Filtro por status ativo") @RequestParam(required = false) Boolean ativo,
            @PageableDefault(size = 20) Pageable pageable) {
        log.info("Requisição para buscar usuários com filtros");
        Page<UsuarioResponseDTO> usuarios = usuarioService.buscarComFiltros(nome, email, lotacao, formacao, ativo, pageable);
        return ResponseEntity.ok(usuarios);
    }
}
