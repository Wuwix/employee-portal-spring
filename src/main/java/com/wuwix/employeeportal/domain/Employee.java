package com.wuwix.employeeportal.domain;

import javax.persistence.*;

@Entity
@Table(name = "pracownicy")

@SecondaryTables({
        @SecondaryTable(name = "adresy", pkJoinColumns = @PrimaryKeyJoinColumn(name = "employee_id")),
        @SecondaryTable(name = "zdjecia", pkJoinColumns = @PrimaryKeyJoinColumn(name = "employee_id"))
})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private double salary;

    @Column(table = "zdjecia")
    private String imgUrl;

    @Column(table = "adresy", nullable = false, columnDefinition = "string default ''")
    private String locality;

    @Column(table = "adresy")
    private String zipCode;

    @Column(table = "adresy")
    private String street;

    @Column(table = "adresy")
    private int streetNumber = 0;

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

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

