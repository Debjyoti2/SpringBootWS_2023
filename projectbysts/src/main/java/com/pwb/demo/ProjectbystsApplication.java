package com.pwb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
@EnableWebMvc
public class ProjectbystsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectbystsApplication.class, args); 
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
		
	
	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.pwb.demo")).build();
	   }

//concept under spring boot
	
	// spring boot actuator -- for health , metrics of the application.
	
	
	// spring boot swagger -- to see all rest apis in browser as a UI, document all API endpopints.
	

//concept under Microservices
	
	// spring boot resilience4j/ Hysterix  - circuit breaker in spring boot. if any restapi fails to get the data , if first retry else it will show default o/p.
	
}
