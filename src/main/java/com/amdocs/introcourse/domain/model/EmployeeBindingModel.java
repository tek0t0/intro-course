package com.amdocs.introcourse.domain.model;


import org.springframework.web.multipart.MultipartFile;

public class EmployeeBindingModel {
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private MultipartFile file;

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

    public MultipartFile getFile() {
        return file;
    }

    public EmployeeBindingModel setFile(MultipartFile file) {
        this.file = file;
        return this;
    }
}
