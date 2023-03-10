package com.example.webService2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class WebService2Application {

	public static void main(String[] args) {
		SpringApplication.run(WebService2Application.class, args);
	}

}
