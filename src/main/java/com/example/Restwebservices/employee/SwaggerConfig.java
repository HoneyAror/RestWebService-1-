package com.example.Restwebservices.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//enable swagger
public class SwaggerConfig {
    //bean-Docket
    //swagger 2
    //all the paths
    //all the apis
    @Bean
    public Docket api()
    {
        return new Docket(DocumentationType.SWAGGER_2);
    }
}
