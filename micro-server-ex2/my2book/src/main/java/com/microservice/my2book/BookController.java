package com.microservice.my2book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@GetMapping("/{id}")
	public String getBook(@PathVariable("id") Long id) {
		return "Book ID : " + id ;
	}

}
