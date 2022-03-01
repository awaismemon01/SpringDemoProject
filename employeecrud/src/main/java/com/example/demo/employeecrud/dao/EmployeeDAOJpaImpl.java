package com.example.demo.employeecrud.dao;

import com.example.demo.employeecrud.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Qualifier("employeeDAOJpaImpl")
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    private EntityManager entityManager;

    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        Session session = entityManager.unwrap(Session.class);

        TypedQuery<Employee> query = entityManager.createQuery("from Employee" , Employee.class);

        List<Employee> employees = query.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int employeeId) {
        Session session = entityManager.unwrap(Session.class);

        Employee employee = entityManager.find(Employee.class, employeeId);

        return employee;
    }

    @Override
    public void save(Employee employee) {
        Session session = entityManager.unwrap(Session.class);

        Employee tempEmployee = entityManager.merge(employee);

        employee.setId(tempEmployee.getId());

    }

    @Override
    public void deleteById(int employeeId) {
        Session session = entityManager.unwrap(Session.class);

        Query query = entityManager.createQuery("delete from Employee where id=:employeeId");

        query.setParameter("employeeId", employeeId);

        query.executeUpdate();
    }
}
