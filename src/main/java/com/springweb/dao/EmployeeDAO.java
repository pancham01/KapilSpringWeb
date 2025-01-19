package com.springweb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.model.Employee;

@Repository
public class EmployeeDAO {
	@Autowired
    private final HibernateTemplate hibernateTemplate;

    public EmployeeDAO(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public void save(Employee employee) {
        hibernateTemplate.save(employee);
    }

    @Transactional
    public List<Employee> getAllEmployees() {
        return hibernateTemplate.loadAll(Employee.class);
    }
}
