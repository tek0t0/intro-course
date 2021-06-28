package com.amdocs.introcourse.domain.model;

public class EmployeeBindingModel {
    private String firstName;
    private String lastName;



    public String getFirstName() {
        return firstName;
    }

    public EmployeeBindingModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public EmployeeBindingModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
