package com.microservice.my2server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class My2serverApplication {

	public static void main(String[] args) {
		SpringApplication.run(My2serverApplication.class, args);
	}

}
