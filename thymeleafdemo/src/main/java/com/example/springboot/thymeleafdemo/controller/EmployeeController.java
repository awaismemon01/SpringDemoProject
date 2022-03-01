package com.example.springboot.thymeleafdemo.controller;

import com.example.springboot.thymeleafdemo.entity.Employee;
import com.example.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String getEmployees(Model model){

        List<Employee> employees = employeeService.findAll();

        model.addAttribute("employees",employees);

        return "employees/list-employees";

    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){

        Employee employee = new Employee();

        model.addAttribute("employee", employee);

        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){

        employeeService.save(employee);

        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int employeeId, Model model){

        Optional<Employee> employee = employeeService.findById(employeeId);

        model.addAttribute("employee",employee);

        return "employees/employee-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int employeeId){

        employeeService.deleteById(employeeId);

        return "redirect:/employees/list";
    }
}
