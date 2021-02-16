package com.brainstation23.bank.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.boot.starter.autoconfigure.OpenApiAutoConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@ConditionalOnClass(OpenApiAutoConfiguration.class)
public class OpenApiConfiguration {

  private final BuildProperties buildProperties;

  public OpenApiConfiguration(BuildProperties buildProperties) {
    this.buildProperties = buildProperties;
  }

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.OAS_30)
        .groupName(buildProperties.getName() + " " + buildProperties.getVersion())
        .select()
        .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(
            new ApiInfoBuilder()
                .title(buildProperties.getName() + " API")
                .description(buildProperties.getName() + " REST API")
                .version(buildProperties.getVersion())
                .license("© Brain Station 23 Ltd.")
                .licenseUrl("https://brainstation-23.com")
                .contact(
                    new Contact(
                        "Md. Rezaul Hasan", "https://brainstation-23.com/", "reza@bs-23.net"))
                .build());
  }
}
