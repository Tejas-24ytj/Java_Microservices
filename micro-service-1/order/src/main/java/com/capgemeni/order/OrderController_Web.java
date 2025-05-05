package com.capgemeni.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/orders_web")
public class OrderController_Web {

	private WebClient.Builder webClientBuilder;
	private final WebClient webClient;

	@Autowired
	public OrderController_Web(WebClient.Builder webClientBuilder) {
		this.webClientBuilder = webClientBuilder;
        this.webClient = this.webClientBuilder.baseUrl("http://user-service").build();
    }

	@GetMapping("/{userId}")
	public String getOrderForUser(@PathVariable Long userId) {
		String user = webClient.get().uri("/users/{id}", userId).retrieve().bodyToMono(String.class).block(); // Blocking
		return "Order placed for " + user;
	}
}
