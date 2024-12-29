package com.office.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save-employee")
    public String saveEmployeeDetails(String name, String position) {
        // Logic to save employee details
        return "Employee details saved!";
    }
}

