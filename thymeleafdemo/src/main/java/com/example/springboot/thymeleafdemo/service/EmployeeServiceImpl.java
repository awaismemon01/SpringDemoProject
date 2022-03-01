package com.example.springboot.thymeleafdemo.service;


import com.example.springboot.thymeleafdemo.dao.EmployeeRepository;
import com.example.springboot.thymeleafdemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    private EmployeeRepository employeeRepository;


    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Optional<Employee> findById(int employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }

}
