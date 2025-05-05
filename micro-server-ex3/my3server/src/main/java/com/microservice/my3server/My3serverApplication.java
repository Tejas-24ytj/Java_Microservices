package com.microservice.my3server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class My3serverApplication {

	public static void main(String[] args) {
		SpringApplication.run(My3serverApplication.class, args);
	}

}
