package com.codeclan.example.company.controllers;

import com.codeclan.example.company.models.Employee;
import com.codeclan.example.company.respositories.DepartmentRepository;
import com.codeclan.example.company.respositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){return employeeRepository.findAll();}
}
