package com.amdocs.introcourse.domain.model;

import com.amdocs.introcourse.domain.entities.Employee;

public class ContactBindingModel {
    private String name;
    private String email;
    private String phone;
    private String message;
    private Employee employee;

    public String getName() {
        return name;
    }

    public ContactBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ContactBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public ContactBindingModel setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ContactBindingModel setMessage(String message) {
        this.message = message;
        return this;
    }

    public Employee getEmployee() {
        return employee;
    }

    public ContactBindingModel setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }
}
