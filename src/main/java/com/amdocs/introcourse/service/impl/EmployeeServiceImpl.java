package com.amdocs.introcourse.service.impl;

import com.amdocs.introcourse.domain.entities.Employee;
import com.amdocs.introcourse.domain.model.EmployeeBindingModel;
import com.amdocs.introcourse.repository.EmployeeRepo;
import com.amdocs.introcourse.service.EmployeeService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepo employeeRepository;
    private final PasswordEncoder passwordEncoder;


    public EmployeeServiceImpl(EmployeeRepo employeeRepository, PasswordEncoder passwordEncoder) {
        this.employeeRepository = employeeRepository;
        this.passwordEncoder = passwordEncoder;
    }


    public Employee addEmployee(EmployeeBindingModel employee, MultipartFile file) throws IOException {
        Employee employeeEntity = new Employee();
        employeeEntity
                .setName(employee.getName())
                .setAddress(employee.getAddress())
                .setPassword(passwordEncoder.encode( employee.getPassword()))
                .setPhone(employee.getPhone())
                .setEmail(employee.getEmail())
                .setFile(file.getBytes());

        return this.employeeRepository.saveAndFlush(employeeEntity);
    }

    public Employee updateEmployee(String empId, Employee employee) {
        Employee employee1 = this.employeeRepository.getById(empId);
        employee1
                .setAddress(employee.getAddress())
                .setEmail((employee.getEmail()))
                .setName(employee.getName())
                .setPassword(employee.getPassword())
                .setPhone(employee.getPhone());

        return employee1;
    }

    public Employee getEmployeeById(String id) {
        return this.employeeRepository.getById(id);
    }

    public List<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }
}
