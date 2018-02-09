/***
 *  Swagger UI configuration class for html based Rest API test
 *  
 *  kghn
 */
package com.kghn.flashtask.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	@Bean
	public Docket simpleDiffServiceApi() {
	  return new Docket(DocumentationType.SWAGGER_2)
	  .groupName("flashtask")
	  .apiInfo(apiInfo())
	  .select()
	  .apis(RequestHandlerSelectors.any())
	  .paths(PathSelectors.any())
	  .build()
	  .pathMapping("/");
	 
	}

	private ApiInfo apiInfo() {
		  return new ApiInfoBuilder()
		  .title("Flash task")
		  .description("Flash Task is a web-based creative collaboration tool")
		  //.contact(new Contact("KGHN Inc.", "http://www.kghn.com", "kghn-info@gmail.com"))
		  .version("1.0")
		  .build();
		}
}
