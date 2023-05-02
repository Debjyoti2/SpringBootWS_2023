package com.pwb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProjectbystsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectbystsApplication.class, args); 
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	
	// spring boot actuator -- for health , metrics of the application.
	// spring boot swagger -- to see all rest apis in browser as a UI
	// spring boot resilience4j/ Hysterix  - circuit breaker in spring boot. if any restapi fails to get the data , if first retry else it will show default o/p.
	
}
