package com.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springweb.model.Employee;
import com.springweb.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public String listEmployees(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "employeeList";
	}

	@GetMapping("/addEmployee")
	public String addEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "addEmployee";
	}

	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestParam(name = "name") String name,
			@RequestParam(name = "department") String department, @RequestParam(name = "salary") int salary) {

		Employee employee = new Employee(name, department, salary);
		employee.setName(name+"  Jiiii");
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}

//    @PostMapping("/addEmployee")
//    public String saveEmployee(@ModelAttribute Employee employee) {
//        employeeService.saveEmployee(employee);
//        return "redirect:/employees";
//    }
}
