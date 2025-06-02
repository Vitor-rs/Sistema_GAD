package com.ifms.gad.estudante.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ifms.gad.estudante.dto.EstudanteCreateDTO;
import com.ifms.gad.estudante.dto.EstudanteResponseDTO;
import com.ifms.gad.estudante.dto.EstudanteUpdateDTO;
import com.ifms.gad.estudante.service.EstudanteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Testes de integração para EstudanteController
 */
@WebMvcTest(EstudanteController.class)
@DisplayName("Testes do EstudanteController")
class EstudanteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EstudanteService estudanteService;

    @Autowired
    private ObjectMapper objectMapper;

    private EstudanteCreateDTO createDTO;
    private EstudanteUpdateDTO updateDTO;
    private EstudanteResponseDTO responseDTO;

    @BeforeEach
    void setUp() {
        createDTO = EstudanteCreateDTO.builder()
                .nome("João Silva")
                .email("joao.silva@ifms.edu.br")
                .cpf("12345678901")
                .telefone("67999887766")
                .dataNascimento(LocalDate.of(2000, 1, 15))
                .endereco("Rua das Flores, 123")
                .cidade("Campo Grande")
                .estado("MS")
                .cep("79000000")
                .build();

        updateDTO = EstudanteUpdateDTO.builder()
                .nome("João Silva Santos")
                .telefone("67999887799")
                .endereco("Rua das Flores, 456")
                .build();

        responseDTO = EstudanteResponseDTO.builder()
                .id(1L)
                .nome("João Silva")
                .email("joao.silva@ifms.edu.br")
                .cpf("12345678901")
                .telefone("67999887766")
                .dataNascimento(LocalDate.of(2000, 1, 15))
                .endereco("Rua das Flores, 123")
                .cidade("Campo Grande")
                .estado("MS")
                .cep("79000000")
                .ativo(true)
                .dataCriacao(LocalDateTime.now())
                .build();
    }

    @Test
    @DisplayName("POST /api/v1/estudantes - Deve criar estudante com sucesso")
    void deveCriarEstudanteComSucesso() throws Exception {
        // Given
        when(estudanteService.criar(any(EstudanteCreateDTO.class))).thenReturn(responseDTO);

        // When & Then
        mockMvc.perform(post("/api/v1/estudantes")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(createDTO)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.nome").value("João Silva"))
                .andExpect(jsonPath("$.email").value("joao.silva@ifms.edu.br"))
                .andExpect(jsonPath("$.cpf").value("12345678901"))
                .andExpect(jsonPath("$.ativo").value(true));
    }

    @Test
    @DisplayName("POST /api/v1/estudantes - Deve retornar erro 400 para dados inválidos")
    void deveRetornarErro400ParaDadosInvalidos() throws Exception {
        // Given
        EstudanteCreateDTO dtoInvalido = EstudanteCreateDTO.builder()
                .nome("") // Nome vazio
                .email("email-invalido") // Email inválido
                .build();

        // When & Then
        mockMvc.perform(post("/api/v1/estudantes")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dtoInvalido)))
                .andExpect(status().isBadRequest());
    }

    @Test
    @DisplayName("GET /api/v1/estudantes/{id} - Deve buscar estudante por ID com sucesso")
    void deveBuscarEstudantePorIdComSucesso() throws Exception {
        // Given
        when(estudanteService.buscarPorId(1L)).thenReturn(responseDTO);

        // When & Then
        mockMvc.perform(get("/api/v1/estudantes/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.nome").value("João Silva"))                .andExpect(jsonPath("$.email").value("joao.silva@ifms.edu.br"));
    }

    @Test
    @DisplayName("PUT /api/v1/estudantes/{id} - Deve atualizar estudante com sucesso")
    void deveAtualizarEstudanteComSucesso() throws Exception {
        // Given
        EstudanteResponseDTO responseDTOAtualizado = EstudanteResponseDTO.builder()
                .id(1L)
                .nome("João Silva Santos")
                .email("joao.silva@ifms.edu.br")
                .cpf("12345678901")
                .telefone("67999887799")
                .dataNascimento(LocalDate.of(2000, 1, 15))
                .endereco("Rua das Flores, 456")
                .cidade("Campo Grande")
                .estado("MS")
                .cep("79000000")
                .ativo(true)
                .dataCriacao(LocalDateTime.now())
                .build();

        when(estudanteService.atualizar(eq(1L), any(EstudanteUpdateDTO.class)))
                .thenReturn(responseDTOAtualizado);

        // When & Then
        mockMvc.perform(put("/api/v1/estudantes/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(updateDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))                .andExpect(jsonPath("$.nome").value("João Silva Santos"))
                .andExpect(jsonPath("$.telefone").value("67999887799"))
                .andExpect(jsonPath("$.endereco").value("Rua das Flores, 456"));
    }

    @Test
    @DisplayName("DELETE /api/v1/estudantes/{id} - Deve remover estudante com sucesso")
    void deveRemoverEstudanteComSucesso() throws Exception {
        // When & Then
        mockMvc.perform(delete("/api/v1/estudantes/1"))
                .andExpect(status().isNoContent());
    }

    @Test
    @DisplayName("GET /api/v1/estudantes - Deve listar estudantes com paginação")
    void deveListarEstudantesComPaginacao() throws Exception {
        // Given
        Page<EstudanteResponseDTO> page = new PageImpl<>(
                List.of(responseDTO), 
                PageRequest.of(0, 20), 
                1
        );
        when(estudanteService.listarTodos(any())).thenReturn(page);

        // When & Then
        mockMvc.perform(get("/api/v1/estudantes")
                        .param("page", "0")
                        .param("size", "20"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").isArray())
                .andExpect(jsonPath("$.content[0].id").value(1))
                .andExpect(jsonPath("$.content[0].nome").value("João Silva"))
                .andExpect(jsonPath("$.totalElements").value(1))
                .andExpect(jsonPath("$.totalPages").value(1));
    }

    @Test
    @DisplayName("GET /api/v1/estudantes/buscar-por-nome - Deve buscar estudantes por nome")
    void deveBuscarEstudantesPorNome() throws Exception {
        // Given
        Page<EstudanteResponseDTO> page = new PageImpl<>(
                List.of(responseDTO), 
                PageRequest.of(0, 20), 
                1
        );
        when(estudanteService.buscarPorNome(eq("João"), any())).thenReturn(page);

        // When & Then
        mockMvc.perform(get("/api/v1/estudantes/buscar-por-nome")
                        .param("nome", "João")
                        .param("page", "0")
                        .param("size", "20"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").isArray())
                .andExpect(jsonPath("$.content[0].nome").value("João Silva"));
    }

    @Test
    @DisplayName("GET /api/v1/estudantes/buscar-por-email - Deve buscar estudante por email")
    void deveBuscarEstudantePorEmail() throws Exception {
        // Given
        when(estudanteService.buscarPorEmail("joao.silva@ifms.edu.br")).thenReturn(responseDTO);

        // When & Then
        mockMvc.perform(get("/api/v1/estudantes/buscar-por-email")
                        .param("email", "joao.silva@ifms.edu.br"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.email").value("joao.silva@ifms.edu.br"));
    }

    @Test
    @DisplayName("GET /api/v1/estudantes/buscar-por-cpf - Deve buscar estudante por CPF")
    void deveBuscarEstudantePorCpf() throws Exception {
        // Given
        when(estudanteService.buscarPorCpf("12345678901")).thenReturn(responseDTO);

        // When & Then
        mockMvc.perform(get("/api/v1/estudantes/buscar-por-cpf")
                        .param("cpf", "12345678901"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.cpf").value("12345678901"));
    }

    @Test
    @DisplayName("GET /api/v1/estudantes/ativos - Deve listar estudantes ativos")
    void deveListarEstudantesAtivos() throws Exception {
        // Given
        Page<EstudanteResponseDTO> page = new PageImpl<>(
                List.of(responseDTO), 
                PageRequest.of(0, 20), 
                1
        );
        when(estudanteService.buscarAtivos(any())).thenReturn(page);

        // When & Then
        mockMvc.perform(get("/api/v1/estudantes/ativos")
                        .param("page", "0")
                        .param("size", "20"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").isArray())
                .andExpect(jsonPath("$.content[0].ativo").value(true));
    }

    @Test
    @DisplayName("PATCH /api/v1/estudantes/{id}/ativar - Deve ativar estudante")
    void deveAtivarEstudante() throws Exception {
        // Given
        when(estudanteService.ativar(1L)).thenReturn(responseDTO);

        // When & Then
        mockMvc.perform(patch("/api/v1/estudantes/1/ativar"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.ativo").value(true));
    }

    @Test
    @DisplayName("PATCH /api/v1/estudantes/{id}/inativar - Deve inativar estudante")
    void deveInativarEstudante() throws Exception {
        // Given
        EstudanteResponseDTO responseDTOInativo = EstudanteResponseDTO.builder()
                .id(1L)
                .nome("João Silva")
                .email("joao.silva@ifms.edu.br")
                .cpf("12345678901")
                .telefone("67999887766")
                .dataNascimento(LocalDate.of(2000, 1, 15))
                .endereco("Rua das Flores, 123")
                .cidade("Campo Grande")
                .estado("MS")
                .cep("79000000")
                .ativo(false)
                .dataCriacao(LocalDateTime.now())
                .build();

        when(estudanteService.inativar(1L)).thenReturn(responseDTOInativo);

        // When & Then
        mockMvc.perform(patch("/api/v1/estudantes/1/inativar"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.ativo").value(false));
    }
}
