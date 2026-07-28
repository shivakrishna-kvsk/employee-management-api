package com.shivakrishna.employeemanagement.service;

import org.springframework.stereotype.Service;

import com.shivakrishna.employeemanagement.entity.Employee;
import com.shivakrishna.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}
