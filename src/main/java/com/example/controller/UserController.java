package com.example.controller;

import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

	//  This method runs before every handler and adds "countries" to the model
	@ModelAttribute("countries")
	public List<String> populateCountries() {
		return List.of("India", "USA", "UK", "Germany");
	}

	@GetMapping("/register")
	public String showForm(Model model) {
//		model.addAttribute("user", new User()); // manually add User to form
		return "registerForm";
	}

	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user, Model model) {
		// user is populated from form inputs
		model.addAttribute("user", user);
		return "success";
	}
}
