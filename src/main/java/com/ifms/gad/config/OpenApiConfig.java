package com.ifms.gad.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuração da documentação OpenAPI/Swagger
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Sistema GAD - API")
                        .description("API REST do Sistema de Gestão Acadêmica Digital do IFMS")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("IFMS - Instituto Federal de Mato Grosso do Sul")
                                .email("contato@ifms.edu.br")
                                .url("https://www.ifms.edu.br"))
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT")));
    }
}
