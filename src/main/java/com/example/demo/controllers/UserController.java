package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "users/")
public class UserController {
	@GetMapping(path = "index")
	public String index() {
		return "Welcome";
	}
}
