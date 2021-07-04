package com.amdocs.introcourse.domain.entities;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee extends BaseEntity{

    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private byte[] file;


    @Column(name = "name")
    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public Employee setPassword(String password) {
        this.password = password;
        return this;
    }
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public Employee setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }

    @Lob
    public byte[] getFile() {
        return file;
    }

    public Employee setFile(byte[] file) {
        this.file = file;
        return this;
    }
}
