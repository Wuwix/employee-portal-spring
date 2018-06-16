package com.wuwix.employeeportal.domain;

import javax.persistence.*;

@Entity
public class EmployeeRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private double salary;
    private double tax;

    @OneToOne
    @JoinColumn(name = "addressId")
    private AddressRelation addressRelation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public AddressRelation getAddressRelation() {
        return addressRelation;
    }

    public void setAddressRelation(AddressRelation addressRelation) {
        this.addressRelation = addressRelation;
    }

    public double getTax() {
        return tax;
    }
}

