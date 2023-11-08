package com.springassesment.api.albanerodemo.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Albanero",
                        email = "contact@Albanero.com",
                        url = "https://Albanero.com/etl-jobs"
                ),
                description = "OpenApi documentation for Albanero",
                title = "OpenApi specification - Albanero",
                version = "1.0",
                license = @License(
                        name = "Licence name",
                        url = "https://Albanero.com"
                ),
                termsOfService = "Terms of service"
        )
)
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class OpenApiConfig {
}
