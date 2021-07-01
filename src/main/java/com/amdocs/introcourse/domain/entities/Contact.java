package com.amdocs.introcourse.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact extends BaseEntity{
    private String name;
    private String email;
    private String phone;
    private String message;
    private Employee employee;

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public Contact setName(String name) {
        this.name = name;
        return this;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public Contact setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public Contact setMessage(String message) {
        this.message = message;
        return this;
    }

    @OneToOne
    public Employee getEmployee() {
        return employee;
    }

    public Contact setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }
}
