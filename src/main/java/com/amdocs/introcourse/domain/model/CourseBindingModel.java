package com.amdocs.introcourse.domain.model;

import java.math.BigDecimal;

public class CourseBindingModel {
    private String name;
    private String description;
    private String resources;
    private BigDecimal fees;

    public String getName() {
        return name;
    }

    public CourseBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CourseBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getResources() {
        return resources;
    }

    public CourseBindingModel setResources(String resources) {
        this.resources = resources;
        return this;
    }

    public BigDecimal getFees() {
        return fees;
    }

    public CourseBindingModel setFees(BigDecimal fees) {
        this.fees = fees;
        return this;
    }
}
