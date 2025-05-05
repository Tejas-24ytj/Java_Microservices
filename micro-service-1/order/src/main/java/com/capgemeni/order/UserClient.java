package com.capgemeni.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service") // refers to Eureka service name
public interface UserClient {

	@GetMapping("/users/{id}")
	String getUserById(@PathVariable("id") Long userId);
}
