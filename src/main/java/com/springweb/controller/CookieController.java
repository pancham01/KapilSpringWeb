package com.springweb.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CookieController {

		@RequestMapping("/")
		@ResponseBody
		public String greet() {
			System.out.println("WelcomeController.greet()");
			return "welcome";
		}
		
		
		@GetMapping("/{id}")
		@ResponseBody
		public String sweet(@PathVariable("id") int id) {
			System.out.println("WelcomeController.sweet()");
			return "Welcome SR.Dev Ji this is your path variable value: "+id;
		}

		@GetMapping("/getCookie")
		@ResponseBody
		public String getCookie(@CookieValue("JSESSIONID") String cookie) {
			return "Hey User! This is your JSESSIONID: " + cookie;
		}

		@GetMapping("/setCookie")
		public String setCookie(HttpServletResponse response) {
			System.out.println("CookieController.setCookie()");
			Cookie cookie = new Cookie("myCookie", "MY_SECRET_COOKIE");
			cookie.setMaxAge(100);
			response.addCookie(cookie);
			return "redirect:/secondCookie";
		}

		
		@GetMapping("/secondCookie")
		@ResponseBody
		public String getMyCookie(@CookieValue("myCookie") String cookie) {
			System.out.println("CookieController.getMyCookie()");
			return "Hey User! This is your secret cookie value: " + cookie;
		}
	}