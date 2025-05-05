package com.microservice.my2book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class My2bookApplication {

	public static void main(String[] args) {
		SpringApplication.run(My2bookApplication.class, args);
	}

}
