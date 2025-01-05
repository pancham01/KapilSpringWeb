package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String greet() {
		System.out.println("WelcomeController.greet()");
		return "welcome";
	}

	@RequestMapping("/hello")
	public String message() {
		System.out.println("WelcomeController.message()");
		return "index";
	}

}
