package com.microservice.my2borrower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/borrower")
public class BorrowerController {
	private RestTemplate restTemplate;

	@Autowired
	public BorrowerController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@GetMapping("/{id}")
	public String getBorrowerForBook(@PathVariable("id") Long id) {
		String book = restTemplate.getForObject("http://book-service/books/" + id, String.class);
		return "Borrowed Book for : " + book;
	}
}
