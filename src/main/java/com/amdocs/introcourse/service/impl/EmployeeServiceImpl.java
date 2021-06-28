package com.amdocs.introcourse.service.impl;

import com.amdocs.introcourse.domain.entities.Employee;
import com.amdocs.introcourse.repository.EmployeeRepo;
import com.amdocs.introcourse.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepo employeeRepository;

    public EmployeeServiceImpl(EmployeeRepo employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee addEmployee(Employee employee) {
        return this.employeeRepository.saveAndFlush(employee);
    }

    public Employee updateEmployee(String empId, Employee employee) {
        Employee employee1 = this.employeeRepository.getById(empId);
        employee1.setFirstName(employee.getFirstName());
        employee1.setSecondName(employee.getSecondName());

        return employee1;
    }

    public Employee getEmployeeById(String id) {
        return this.employeeRepository.getById(id);
    }

    public List<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }
}
