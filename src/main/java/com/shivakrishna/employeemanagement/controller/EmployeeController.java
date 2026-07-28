package com.shivakrishna.employeemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to Employee Management API!";
    }
}
