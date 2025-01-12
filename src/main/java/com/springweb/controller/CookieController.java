package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

	// Endpoint to create and set a cookie
	@GetMapping("/set-cookie")
	@ResponseBody
	public String setCookie(HttpServletResponse response) {
		// Create a new cookie
		Cookie cookie = new Cookie("username", "JohnDoe");
		cookie.setMaxAge(7 * 24 * 60 * 60); // Cookie valid for 7 days
		response.addCookie(cookie); // Add cookie to response
		return "Cookie has been set!";
	}

	// Endpoint to read the cookie using @CookieValue
	@GetMapping("/get-cookie")
	@ResponseBody
	public String getCookie(@CookieValue(value = "username", defaultValue = "Guest") String username) {
		return "Hello, " + username + "!";
	}
}
