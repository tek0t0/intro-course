package com.amdocs.introcourse.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "courses")
public class Course extends BaseEntity {
    private String name;
    private String description;
    private String resources;
    private BigDecimal fees;


    @Column(name = "name")
    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    @Column(name = "description", columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public Course setDescription(String description) {
        this.description = description;
        return this;
    }
    @Column(name = "resources")
    public String getResources() {
        return resources;
    }

    public Course setResources(String resources) {
        this.resources = resources;
        return this;
    }
    @Column(name = "fee")
    public BigDecimal getFees() {
        return fees;
    }

    public Course setFees(BigDecimal fees) {
        this.fees = fees;
        return this;
    }
}
