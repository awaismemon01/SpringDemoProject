package com.example.demo.employeecrud.service;

import com.example.demo.employeecrud.dao.EmployeeDAO;
import com.example.demo.employeecrud.entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

//    private EmployeeRepository employeeRepository



    public EmployeeServiceImpl(@Qualifier("employeeDAOHibernateImpl") EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }



//    TO USE JPA IMPLEMENTATION
//    public EmployeeServiceImpl(@Qualifier("employeeDAOJpaImpl") EmployeeDAO employeeDAO) {
//        this.employeeDAO = employeeDAO;
//    }


//    TO USE SPRING JPA REPOSITORY INTERFACE
//    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }



//  IN CASE OF JPA REPOSITORY, REMOVE @TRANSACTIONAL AS JPA REPO PROVIDES IT


    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int employeeId) {
        return employeeDAO.findById(employeeId);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int employeeId) {
        employeeDAO.deleteById(employeeId);
    }

}
