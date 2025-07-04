package nassau.restaurant.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API Restaurante")
                .version("1.0")
                .description("Documentação da API do sistema de restaurante")
                .contact(new Contact()
                    .name("Higor Manoel")
                    .email("exemplo@email.com")
                ));
    }
}
