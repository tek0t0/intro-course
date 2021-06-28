package com.amdocs.introcourse.service;

import com.amdocs.introcourse.domain.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee); // to add new Employee
    public Employee updateEmployee(String empId, Employee employee); // update
    public Employee getEmployeeById(String id); // to get the specific employee details
    public List<Employee> getEmployees(); // to get all employee details.
}