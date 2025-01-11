package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String greet() {
		System.out.println("WelcomeController.greet()");
		return "welcome";
	}

	@RequestMapping("/hello")
	public String message(@RequestParam(name = "user",defaultValue = "Default value...") String name) {
		System.out.println("WelcomeController.message()   "+name);
		return "index";
	}

}
