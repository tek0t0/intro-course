package com.amdocs.introcourse.service.impl;

import com.amdocs.introcourse.domain.entities.Employee;
import com.amdocs.introcourse.domain.model.EmployeeBindingModel;
import com.amdocs.introcourse.repository.EmployeeRepo;
import com.amdocs.introcourse.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepo employeeRepository;
    private  final ModelMapper modelMapper;

    public EmployeeServiceImpl(EmployeeRepo employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }


    public Employee addEmployee(EmployeeBindingModel employee) {

        return this.employeeRepository.saveAndFlush(modelMapper.map(employee, Employee.class));
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
