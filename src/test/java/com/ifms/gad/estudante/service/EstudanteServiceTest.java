package com.ifms.gad.estudante.service;

import com.ifms.gad.config.exception.BusinessException;
import com.ifms.gad.config.exception.ResourceNotFoundException;
import com.ifms.gad.estudante.dto.EstudanteCreateDTO;
import com.ifms.gad.estudante.dto.EstudanteResponseDTO;
import com.ifms.gad.estudante.dto.EstudanteUpdateDTO;
import com.ifms.gad.estudante.entity.Estudante;
import com.ifms.gad.estudante.mapper.EstudanteMapper;
import com.ifms.gad.estudante.repository.EstudanteRepository;
import com.ifms.gad.estudante.service.impl.EstudanteServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

/**
 * Testes unitários para EstudanteService
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("Testes do EstudanteService")
class EstudanteServiceTest {

    @Mock
    private EstudanteRepository estudanteRepository;

    @Mock
    private EstudanteMapper estudanteMapper;

    @InjectMocks
    private EstudanteServiceImpl estudanteService;

    private EstudanteCreateDTO createDTO;
    private EstudanteUpdateDTO updateDTO;
    private EstudanteResponseDTO responseDTO;
    private Estudante estudante;

    @BeforeEach
    void setUp() {
        // Setup dos DTOs
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

        // Setup da entidade
        estudante = new Estudante();
        estudante.setId(1L);
        estudante.setNome("João Silva");
        estudante.setEmail("joao.silva@ifms.edu.br");
        estudante.setCpf("12345678901");
        estudante.setTelefone("67999887766");
        estudante.setDataNascimento(LocalDate.of(2000, 1, 15));
        estudante.setEndereco("Rua das Flores, 123");
        estudante.setCidade("Campo Grande");
        estudante.setEstado("MS");
        estudante.setCep("79000000");
        estudante.setAtivo(true);
        estudante.setDataCriacao(LocalDateTime.now());

        // Setup do Response DTO
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
    @DisplayName("Deve criar estudante com sucesso")
    void deveCriarEstudanteComSucesso() {
        // Given
        when(estudanteRepository.findByEmail(createDTO.getEmail())).thenReturn(Optional.empty());
        when(estudanteRepository.findByCpf(createDTO.getCpf())).thenReturn(Optional.empty());
        when(estudanteMapper.toEntity(createDTO)).thenReturn(estudante);
        when(estudanteRepository.save(any(Estudante.class))).thenReturn(estudante);
        when(estudanteMapper.toResponseDTO(estudante)).thenReturn(responseDTO);

        // When
        EstudanteResponseDTO resultado = estudanteService.criar(createDTO);

        // Then
        assertThat(resultado).isNotNull();
        assertThat(resultado.getNome()).isEqualTo(createDTO.getNome());
        assertThat(resultado.getEmail()).isEqualTo(createDTO.getEmail());
        assertThat(resultado.getCpf()).isEqualTo(createDTO.getCpf());

        verify(estudanteRepository).findByEmail(createDTO.getEmail());
        verify(estudanteRepository).findByCpf(createDTO.getCpf());
        verify(estudanteMapper).toEntity(createDTO);
        verify(estudanteRepository).save(any(Estudante.class));
        verify(estudanteMapper).toResponseDTO(estudante);
    }

    @Test
    @DisplayName("Deve lançar exceção ao criar estudante com email já existente")
    void deveLancarExcecaoAoCriarEstudanteComEmailExistente() {
        // Given
        when(estudanteRepository.findByEmail(createDTO.getEmail())).thenReturn(Optional.of(estudante));

        // When & Then
        assertThatThrownBy(() -> estudanteService.criar(createDTO))
                .isInstanceOf(BusinessException.class)
                .hasMessageContaining("Email já está em uso");

        verify(estudanteRepository).findByEmail(createDTO.getEmail());
        verify(estudanteRepository, never()).save(any());
    }

    @Test
    @DisplayName("Deve lançar exceção ao criar estudante com CPF já existente")
    void deveLancarExcecaoAoCriarEstudanteComCpfExistente() {
        // Given
        when(estudanteRepository.findByEmail(createDTO.getEmail())).thenReturn(Optional.empty());
        when(estudanteRepository.findByCpf(createDTO.getCpf())).thenReturn(Optional.of(estudante));

        // When & Then
        assertThatThrownBy(() -> estudanteService.criar(createDTO))
                .isInstanceOf(BusinessException.class)
                .hasMessageContaining("CPF já está em uso");

        verify(estudanteRepository).findByEmail(createDTO.getEmail());
        verify(estudanteRepository).findByCpf(createDTO.getCpf());
        verify(estudanteRepository, never()).save(any());
    }

    @Test
    @DisplayName("Deve buscar estudante por ID com sucesso")
    void deveBuscarEstudantePorIdComSucesso() {
        // Given
        when(estudanteRepository.findById(1L)).thenReturn(Optional.of(estudante));
        when(estudanteMapper.toResponseDTO(estudante)).thenReturn(responseDTO);

        // When
        EstudanteResponseDTO resultado = estudanteService.buscarPorId(1L);

        // Then
        assertThat(resultado).isNotNull();
        assertThat(resultado.getId()).isEqualTo(1L);
        assertThat(resultado.getNome()).isEqualTo(estudante.getNome());

        verify(estudanteRepository).findById(1L);
        verify(estudanteMapper).toResponseDTO(estudante);
    }

    @Test
    @DisplayName("Deve lançar exceção ao buscar estudante inexistente")
    void deveLancarExcecaoAoBuscarEstudanteInexistente() {
        // Given
        when(estudanteRepository.findById(1L)).thenReturn(Optional.empty());

        // When & Then
        assertThatThrownBy(() -> estudanteService.buscarPorId(1L))
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessageContaining("Estudante não encontrado com ID: 1");

        verify(estudanteRepository).findById(1L);
        verify(estudanteMapper, never()).toResponseDTO(any());
    }

    @Test
    @DisplayName("Deve atualizar estudante com sucesso")
    void deveAtualizarEstudanteComSucesso() {
        // Given
        when(estudanteRepository.findById(1L)).thenReturn(Optional.of(estudante));
        when(estudanteRepository.save(any(Estudante.class))).thenReturn(estudante);
        when(estudanteMapper.toResponseDTO(estudante)).thenReturn(responseDTO);

        // When
        EstudanteResponseDTO resultado = estudanteService.atualizar(1L, updateDTO);

        // Then
        assertThat(resultado).isNotNull();

        verify(estudanteRepository).findById(1L);
        verify(estudanteMapper).updateEntityFromDTO(updateDTO, estudante);
        verify(estudanteRepository).save(estudante);
        verify(estudanteMapper).toResponseDTO(estudante);
    }

    @Test
    @DisplayName("Deve lançar exceção ao atualizar estudante inexistente")
    void deveLancarExcecaoAoAtualizarEstudanteInexistente() {
        // Given
        when(estudanteRepository.findById(1L)).thenReturn(Optional.empty());

        // When & Then
        assertThatThrownBy(() -> estudanteService.atualizar(1L, updateDTO))
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessageContaining("Estudante não encontrado com ID: 1");

        verify(estudanteRepository).findById(1L);
        verify(estudanteRepository, never()).save(any());
    }

    @Test
    @DisplayName("Deve remover estudante com sucesso")
    void deveRemoverEstudanteComSucesso() {
        // Given
        when(estudanteRepository.existsById(1L)).thenReturn(true);

        // When
        assertThatCode(() -> estudanteService.remover(1L))
                .doesNotThrowAnyException();

        // Then
        verify(estudanteRepository).existsById(1L);
        verify(estudanteRepository).deleteById(1L);
    }

    @Test
    @DisplayName("Deve lançar exceção ao remover estudante inexistente")
    void deveLancarExcecaoAoRemoverEstudanteInexistente() {
        // Given
        when(estudanteRepository.existsById(1L)).thenReturn(false);

        // When & Then
        assertThatThrownBy(() -> estudanteService.remover(1L))
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessageContaining("Estudante não encontrado com ID: 1");

        verify(estudanteRepository).existsById(1L);
        verify(estudanteRepository, never()).deleteById(any());
    }

    @Test
    @DisplayName("Deve listar todos os estudantes com paginação")
    void deveListarTodosEstudantesComPaginacao() {
        // Given
        Pageable pageable = PageRequest.of(0, 10);
        Page<Estudante> estudantesPage = new PageImpl<>(List.of(estudante), pageable, 1);
        when(estudanteRepository.findAll(pageable)).thenReturn(estudantesPage);
        when(estudanteMapper.toResponseDTO(estudante)).thenReturn(responseDTO);

        // When
        Page<EstudanteResponseDTO> resultado = estudanteService.listarTodos(pageable);

        // Then
        assertThat(resultado).isNotNull();
        assertThat(resultado.getContent()).hasSize(1);
        assertThat(resultado.getContent().get(0).getId()).isEqualTo(1L);

        verify(estudanteRepository).findAll(pageable);
        verify(estudanteMapper).toResponseDTO(estudante);
    }

    @Test
    @DisplayName("Deve buscar estudantes por nome")
    void deveBuscarEstudantesPorNome() {
        // Given
        String nome = "João";
        Pageable pageable = PageRequest.of(0, 10);
        Page<Estudante> estudantesPage = new PageImpl<>(List.of(estudante), pageable, 1);
        when(estudanteRepository.findByNomeContainingIgnoreCase(nome, pageable)).thenReturn(estudantesPage);
        when(estudanteMapper.toResponseDTO(estudante)).thenReturn(responseDTO);

        // When
        Page<EstudanteResponseDTO> resultado = estudanteService.buscarPorNome(nome, pageable);

        // Then
        assertThat(resultado).isNotNull();
        assertThat(resultado.getContent()).hasSize(1);

        verify(estudanteRepository).findByNomeContainingIgnoreCase(nome, pageable);
        verify(estudanteMapper).toResponseDTO(estudante);
    }

    @Test
    @DisplayName("Deve buscar estudante por email")
    void deveBuscarEstudantePorEmail() {
        // Given
        String email = "joao.silva@ifms.edu.br";
        when(estudanteRepository.findByEmail(email)).thenReturn(Optional.of(estudante));
        when(estudanteMapper.toResponseDTO(estudante)).thenReturn(responseDTO);

        // When
        EstudanteResponseDTO resultado = estudanteService.buscarPorEmail(email);

        // Then
        assertThat(resultado).isNotNull();
        assertThat(resultado.getEmail()).isEqualTo(email);

        verify(estudanteRepository).findByEmail(email);
        verify(estudanteMapper).toResponseDTO(estudante);
    }

    @Test
    @DisplayName("Deve ativar estudante com sucesso")
    void deveAtivarEstudanteComSucesso() {
        // Given
        estudante.setAtivo(false);
        when(estudanteRepository.findById(1L)).thenReturn(Optional.of(estudante));
        when(estudanteRepository.save(estudante)).thenReturn(estudante);
        when(estudanteMapper.toResponseDTO(estudante)).thenReturn(responseDTO);

        // When
        EstudanteResponseDTO resultado = estudanteService.ativar(1L);

        // Then
        assertThat(resultado).isNotNull();
        assertThat(estudante.isAtivo()).isTrue();

        verify(estudanteRepository).findById(1L);
        verify(estudanteRepository).save(estudante);
        verify(estudanteMapper).toResponseDTO(estudante);
    }

    @Test
    @DisplayName("Deve lançar exceção ao ativar estudante já ativo")
    void deveLancarExcecaoAoAtivarEstudanteJaAtivo() {
        // Given
        estudante.setAtivo(true);
        when(estudanteRepository.findById(1L)).thenReturn(Optional.of(estudante));

        // When & Then
        assertThatThrownBy(() -> estudanteService.ativar(1L))
                .isInstanceOf(BusinessException.class)
                .hasMessageContaining("Estudante já está ativo");

        verify(estudanteRepository).findById(1L);
        verify(estudanteRepository, never()).save(any());
    }

    @Test
    @DisplayName("Deve inativar estudante com sucesso")
    void deveInativarEstudanteComSucesso() {
        // Given
        estudante.setAtivo(true);
        when(estudanteRepository.findById(1L)).thenReturn(Optional.of(estudante));
        when(estudanteRepository.save(estudante)).thenReturn(estudante);
        when(estudanteMapper.toResponseDTO(estudante)).thenReturn(responseDTO);

        // When
        EstudanteResponseDTO resultado = estudanteService.inativar(1L);

        // Then
        assertThat(resultado).isNotNull();
        assertThat(estudante.isAtivo()).isFalse();

        verify(estudanteRepository).findById(1L);
        verify(estudanteRepository).save(estudante);
        verify(estudanteMapper).toResponseDTO(estudante);
    }
}
