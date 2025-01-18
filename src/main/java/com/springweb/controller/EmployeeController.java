package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springweb.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/form")
    public String showForm(Model model) {
    	System.out.println("EmployeeController.showForm()");
        model.addAttribute("employee", new Employee());
        return "employeeForm";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Employee employee, Model model) {
        // Add the submitted employee to the model
       System.out.println("EmployeeController.submitForm()");
    	model.addAttribute("employee", employee);
        return "employeeSuccess";
    }
}
