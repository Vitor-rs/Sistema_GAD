package com.ifms.gad.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuração específica para o H2 Console
 * Resolve problemas de CORS e outras configurações necessárias para o console funcionar
 */
@Configuration
@Profile("dev")
@ConditionalOnProperty(name = "spring.h2.console.enabled", havingValue = "true")
public class H2ConsoleConfig {

    /**
     * Configuração CORS para permitir acesso ao H2 Console
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/h2-console/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(false);
            }
        };
    }
}
