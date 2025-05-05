package com.microservice.my3order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
	private final OrderFein orderFein; 
	
	@Autowired
	public OrderController(OrderFein orderFein) {
		this.orderFein = orderFein;
	}
	
	@GetMapping("/{id}")
	public String getOrderForProducts(@PathVariable("id") Long id) {
		String product = orderFein.getProductById(id);
		return "Order placed for Product : " + product;
	}

}
