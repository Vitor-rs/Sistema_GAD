package com.ifms.gad.config;

import com.ifms.gad.usuario.entity.FuncaoTag;
import com.ifms.gad.usuario.repository.FuncaoTagRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Componente responsável por inicializar dados básicos do sistema
 * Executa automaticamente na inicialização da aplicação
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class DataInitializer implements CommandLineRunner {

    private final FuncaoTagRepository funcaoTagRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Iniciando a população de dados básicos do sistema...");
        
        criarFuncoesTagsBasicas();
        
        log.info("População de dados básicos concluída com sucesso!");
    }

    private void criarFuncoesTagsBasicas() {
        log.info("Verificando e criando funções/tags básicas...");

        List<FuncaoTag> funcoesBasicas = Arrays.asList(
            FuncaoTag.builder()
                .codigo("DOCENTE")
                .nome("Docente")
                .descricao("Professor do IFMS responsável por ministrar aulas e orientar estudantes")
                .build(),
                
            FuncaoTag.builder()
                .codigo("COORDENADOR")
                .nome("Coordenador")
                .descricao("Coordenador geral de área ou setor")
                .build(),
                
            FuncaoTag.builder()
                .codigo("DIRETOR")
                .nome("Diretor")
                .descricao("Diretor de campus ou departamento")
                .build(),
                
            FuncaoTag.builder()
                .codigo("TECNICO_ADMIN")
                .nome("Técnico Administrativo")
                .descricao("Servidor técnico-administrativo do IFMS")
                .build(),
                
            FuncaoTag.builder()
                .codigo("COORD_CURSO")
                .nome("Coordenador de Curso")
                .descricao("Coordenador responsável por curso específico")
                .build(),
                
            FuncaoTag.builder()
                .codigo("COORD_EXTENSAO")
                .nome("Coordenador de Extensão")
                .descricao("Coordenador responsável por projetos de extensão")
                .build(),
                
            FuncaoTag.builder()
                .codigo("COORD_PESQUISA")
                .nome("Coordenador de Pesquisa")
                .descricao("Coordenador responsável por projetos de pesquisa")
                .build(),
                
            FuncaoTag.builder()
                .codigo("SECRETARIO")
                .nome("Secretário")
                .descricao("Responsável por secretaria e documentação")
                .build(),
                
            FuncaoTag.builder()
                .codigo("BIBLIOTECARIO")
                .nome("Bibliotecário")
                .descricao("Responsável pela biblioteca e acervo")
                .build(),
                
            FuncaoTag.builder()
                .codigo("PEDAGOGO")
                .nome("Pedagogo")
                .descricao("Responsável por questões pedagógicas e educacionais")
                .build(),
                
            FuncaoTag.builder()
                .codigo("ASSISTENTE_SOCIAL")
                .nome("Assistente Social")
                .descricao("Responsável por assistência social aos estudantes")
                .build(),
                
            FuncaoTag.builder()
                .codigo("PSICOLOGO")
                .nome("Psicólogo")
                .descricao("Responsável por atendimento psicológico")
                .build()
        );

        for (FuncaoTag funcao : funcoesBasicas) {
            // Verifica se a função já existe pelo código
            if (!funcaoTagRepository.existsByCodigo(funcao.getCodigo())) {
                FuncaoTag funcaoSalva = funcaoTagRepository.save(funcao);
                log.info("Função criada: {} - {}", funcaoSalva.getCodigo(), funcaoSalva.getNome());
            } else {
                log.debug("Função já existe: {}", funcao.getCodigo());
            }
        }
        
        long totalFuncoes = funcaoTagRepository.count();
        log.info("Total de funções/tags disponíveis: {}", totalFuncoes);
    }
}
