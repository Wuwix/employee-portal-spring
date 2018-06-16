package com.wuwix.employeeportal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {
    @Id
    @GeneratedValue
    private long id;
    private String number;
    private String type;

//    //for bidirectional relation
//    @ManyToOne
//    private EmployeeRelationMany employee;

    public Phone() {}

    public Phone(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
