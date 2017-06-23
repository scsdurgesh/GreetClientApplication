package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCircuitBreaker
@EnableZuulProxy
public class GreetClientApplication {

	
	@Bean	
	public PreFilter preFilter(){
		
	return new PreFilter();
		
	}
	public static void main(String[] args) {
		SpringApplication.run(GreetClientApplication.class, args);
	}
}
