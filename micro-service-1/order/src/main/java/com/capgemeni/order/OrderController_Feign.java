package com.capgemeni.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders_feign")
public class OrderController_Feign {

	private final UserClient userClient;

	@Autowired
	public OrderController_Feign(UserClient userClient) {
        this.userClient = userClient;
    }

	@GetMapping("/{userId}")
	public String getOrderForUser(@PathVariable Long userId) {
		String user = userClient.getUserById(userId);
		return "Order placed for " + user;
	}
}
