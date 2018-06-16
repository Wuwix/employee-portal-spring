package com.wuwix.employeeportal.domain;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "users")
public class User {

    // The entity fields (private)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "email", columnDefinition = "VARCHAR(30) NOT NULL")
    private String email;

    @NotNull
    private String name;

    @Column(precision = 10, scale = 2)
    private BigDecimal salary;


    // Public methods

    public User() { }

    public User(long id) {
        this.id = id;
    }

    public User(String email, String name, BigDecimal salary) {
        this.email = email;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}