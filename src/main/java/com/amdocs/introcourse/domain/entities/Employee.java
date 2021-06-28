package com.amdocs.introcourse.domain.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee extends BaseEntity{


    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public Employee setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }
}
