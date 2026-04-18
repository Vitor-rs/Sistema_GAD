// apps/backend/src/test/java/br/edu/ifms/gad/api/TestcontainersConfiguration.java
package br.edu.ifms.gad.api;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

/**
 * Configuração de teste que sobe um PostgreSQL real via Docker.
 *
 * A ideia tradicional (e correta): teste contra o mesmo banco de produção.
 * Isso evita o clássico "funciona em dev, quebra em prod porque H2 não
 * suporta jsonb" — um clássico que custou noites de sono a muita gente.
 *
 * A anotação @ServiceConnection é a cereja do bolo: desde Spring Boot 3.1,
 * ela injeta automaticamente as propriedades spring.datasource.url,
 * username e password no ApplicationContext, lendo do container que sobe.
 * Zero configuração manual.
 */
@TestConfiguration(proxyBeanMethods = false)
public class TestcontainersConfiguration {

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgresContainer() {
        // postgres:16-alpine é leve (~80 MB) e rápido para subir (~3 segundos).
        // Quando formos para pgvector no Sprint 4, trocamos para pgvector/pgvector:pg16.
        return new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));
    }
}
