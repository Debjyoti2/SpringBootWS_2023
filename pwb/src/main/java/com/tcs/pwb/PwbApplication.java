package com.tcs.pwb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class PwbApplication {

	public static void main(String[] args) {
		SpringApplication.run(PwbApplication.class, args);
	}

}
