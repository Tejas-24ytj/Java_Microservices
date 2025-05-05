package com.capgemeni.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {
	private RestTemplate restTemplate;

	@Autowired
	public OrderController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@GetMapping("/{userId}")
	public String getOrderForUser(@PathVariable Long userId) {
		String user = restTemplate.getForObject("http://user-service/users/" + userId, String.class);
		return "Order placed for " + user;
	}

}
