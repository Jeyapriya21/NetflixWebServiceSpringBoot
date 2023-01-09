package com.example.ServiceLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ServiceLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceLoginApplication.class, args);
	}

}
