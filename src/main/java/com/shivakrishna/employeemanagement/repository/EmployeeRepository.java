package com.shivakrishna.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivakrishna.employeemanagement.entity.Employee;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
