package com.capgemeni.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping("/{id}")
	public String getUser(@PathVariable Long id) {
		return "User ID: " + id;
	}
}
