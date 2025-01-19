package com.springweb.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.dao.EmployeeDAO;
import com.springweb.model.Employee;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void saveEmployee(Employee employee) {
        employeeDAO.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
