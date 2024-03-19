package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class WelcomeController {

	@GetMapping("welcome")
	public String welcome() {
		System.out.println("welcome to the rest controller ::::::::::::::::::::::::: pavan");
		System.err.println("if it is");
		return "Hello :::::: pavan";
	}

}
