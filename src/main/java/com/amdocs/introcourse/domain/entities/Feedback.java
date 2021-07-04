package com.amdocs.introcourse.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Feedback extends BaseEntity {

    private String text;
    private Course course;
    private Employee employee;


    @Column
    public String getText() {
        return text;
    }

    public Feedback setText(String text) {
        this.text = text;
        return this;
    }

    @OneToOne
    public Course getCourse() {
        return course;
    }

    public Feedback setCourse(Course course) {
        this.course = course;
        return this;
    }

    @OneToOne
    public Employee getEmployee() {
        return employee;
    }

    public Feedback setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }
}
