package com.amdocs.introcourse.repository;

import com.amdocs.introcourse.domain.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {
    Employee addEmployee(Employee employee);

}
