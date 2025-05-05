package com.microservice.my3order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface OrderFein {

	@GetMapping("products/{id}")
	String getProductById(@PathVariable("id") Long id);

}
