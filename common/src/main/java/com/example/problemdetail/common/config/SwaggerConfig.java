package com.example.problemdetail.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class SwaggerConfig implements WebMvcConfigurer {
  @Bean
  public OpenAPI demoOpenAPI() {
    return new OpenAPI()
      .info(new Info().title("saturn starters demo web API")
        .description("")
        .version("0.0.1")
    );
  }

}


