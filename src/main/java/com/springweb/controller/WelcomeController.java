package com.springweb.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome() {
		System.out.println("WelcomeController.welcome()");
		return "home";
	}

	@RequestMapping("/sign-up")
	public String signUp() {
		return "form";
	}

	@RequestMapping("/cookie")
	@ResponseBody
	public String cookie(@CookieValue(name = "JSESSIONID", defaultValue = "Don") String cookieVal) {
		return "Your JSESSIONID is: " + cookieVal;
	}
	
	@RequestMapping("/my-cookie")
	@ResponseBody
	public String cookie2(@CookieValue(name = "myCookie", defaultValue = "Guest") String cookieVal) {
		return "Your JSESSIONID is: " + cookieVal;
	}

	@RequestMapping("/setCookie")
	public String setCookie(HttpServletResponse response) {
		Cookie cookie = new Cookie("myCookie", "DangerValue");
		cookie.setMaxAge(3600); // Cookie will expire in 1 hour
		response.addCookie(cookie);
		return "redirect:/my-cookie";
	}

	@RequestMapping("/welcome")
	@ResponseBody
	public String requestParam(@RequestParam(name = "name", defaultValue = "Guest") String name) {
		System.out.println("WelcomeController.requestParam()");
		return "Hello! " + name + " how are you doing............";
	}

	@RequestMapping("/path/{id}")
	@ResponseBody
	public String pathVar(@PathVariable(name = "id") Long id) {
		System.out.println("WelcomeController.requestParam()");
		return "ID number '" + id + "' is valid............";
	}

	@PostMapping("/submitForm")
	public String handleForm(@RequestParam("username") String username, @RequestParam("email") String email,
			Model model) {

		// Add values to the model to show in the response page
		model.addAttribute("username", username);
		model.addAttribute("email", email);

		return "result";
	}

}
