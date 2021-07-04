package com.amdocs.introcourse.service;

import com.amdocs.introcourse.domain.entities.Employee;
import com.amdocs.introcourse.domain.model.EmployeeBindingModel;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(EmployeeBindingModel employee, MultipartFile file) throws IOException; // to add new Employee
    public Employee updateEmployee(String empId, Employee employee); // update
    public Employee getEmployeeByName(String name); // to get the specific employee details
    public List<Employee> getEmployees(); // to get all employee details.
}
