package com.example.springboot.thymeleafdemo.service;


import com.example.springboot.thymeleafdemo.entity.Employee;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {
    public List<Employee> findAll();

    public Optional<Employee> findById(int employeeId);

    public void save(Employee employee);

    public void deleteById(int employeeId);

}
