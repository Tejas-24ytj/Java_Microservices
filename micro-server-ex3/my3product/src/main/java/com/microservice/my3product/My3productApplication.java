package com.microservice.my3product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class My3productApplication {

	public static void main(String[] args) {
		SpringApplication.run(My3productApplication.class, args);
	}

}
