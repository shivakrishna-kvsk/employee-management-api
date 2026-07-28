package com.shivakrishna.employeemanagement.service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long Id){
        return employeeRepository.findById(Id);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {

    Employee existingEmployee = employeeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee not found"));

    existingEmployee.setFirstName(employee.getFirstName());
    existingEmployee.setLastName(employee.getLastName());
    existingEmployee.setEmail(employee.getEmail());
    existingEmployee.setSalary(employee.getSalary());

    return employeeRepository.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
    Employee employee = employeeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee not found"));
    employeeRepository.delete(employee);

}
}
