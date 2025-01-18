package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	@ResponseBody
	public String greet() {
		System.out.println("WelcomeController.greet()");
		return "welcome to the spring form";
	}

	@RequestMapping("/hello")
	public String message(@RequestParam(name = "user", defaultValue = "Default value...") String name) {
		System.out.println("WelcomeController.message()   " + name);
		return "index";
	}

	@RequestMapping("/get/{id}")
	@ResponseBody
	public String pathVar(@PathVariable(name = "id") int id) {
		System.out.println("WelcomeController  pathVar()   " + id);
		return "This is my response to client that your id is: "+id;
	}

}
