package com.shivakrishna.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import com.shivakrishna.employeemanagement.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}
