package com.microservice.my2borrower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class My2borrowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(My2borrowerApplication.class, args);
	}

}
