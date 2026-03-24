package com.lidiadobos.usermanagement.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI userManagementOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("User Management API")
                        .description("A Spring Boot REST API for managing users with validation, H2, and JPA.")
                        .version("v1")
                        .contact(new Contact()
                                .name("Lidia Dobos")
                                .url("https://github.com/lidiadobos03-byte")
                                .email("lidiadobos02@gmail.com")))
                .addTagsItem(new Tag()
                        .name("Users")
                        .description("Operations for creating, reading, updating, and deleting users."));
    }
}
