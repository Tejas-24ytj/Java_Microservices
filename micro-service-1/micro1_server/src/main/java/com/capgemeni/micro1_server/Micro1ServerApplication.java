package com.capgemeni.micro1_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class Micro1ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Micro1ServerApplication.class, args);
	}

}
