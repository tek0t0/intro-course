package com.amdocs.introcourse.domain.model;

public class EmployeeBindingModel {
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String photo;

    public String getName() {
        return name;
    }

    public EmployeeBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public EmployeeBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public EmployeeBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public EmployeeBindingModel setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public EmployeeBindingModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public EmployeeBindingModel setPhoto(String photo) {
        this.photo = photo;
        return this;
    }
}
