package com.pwb.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	
	public static final String[] SWAGGER_URL_STRINGS= {
			"/api/v1/auth/**",
			"/v3/api-docs/**",
			"/v2/api-docs/**",
			"/swagger-resources/**",
			"/swagger-ui/**",
			"/webjars/**"
			
	};

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/login").permitAll()
		.antMatchers("/getemp").permitAll()
		.antMatchers("/user/saveuser").permitAll()
		.antMatchers("/actuator/**").permitAll()
		.antMatchers("/registerAccount/**").permitAll()
		.antMatchers("/getallemp").permitAll() 
		.antMatchers(SWAGGER_URL_STRINGS).permitAll() 
		.antMatchers("/home/**").permitAll()
		.antMatchers("/findbyname").hasRole("ADMIN")
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.loginPage("/login")
		.loginProcessingUrl("/dologin");
		
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("deb").password("Pass@123").roles("TM");
		auth.inMemoryAuthentication().withUser("kittu").password("Pass@456").roles("ADMIN");
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(10);
	}
	

}
