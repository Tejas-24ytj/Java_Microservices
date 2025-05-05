package com.microservice.my3order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.microservice.my3order")
public class My3orderApplication {

	public static void main(String[] args) {
		SpringApplication.run(My3orderApplication.class, args);
	}

}
