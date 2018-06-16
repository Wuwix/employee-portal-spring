package com.wuwix.employeeportal.domain;

import com.sun.istack.internal.NotNull;
import com.wuwix.employeeportal.converters.LocalDateConverter;
import com.wuwix.employeeportal.converters.LocalDateTimeConverter;
import com.wuwix.employeeportal.converters.LocalTimeConverter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "DataCzas")
public class DataTime {

    // The entity fields (private)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @Column(name = "data_czas_lokalna")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime localDateTime;

    @Column(name = "data_lokalna")
    @Convert(converter = LocalDateConverter.class)
    private LocalDate localDate;

    @Column(name = "czas_lokalny")
    @Convert(converter = LocalTimeConverter.class)
    private LocalTime localTime;

    // Public methods

    public DataTime() { }

    public DataTime(long id) {
        this.id = id;
    }

    public DataTime(String name, LocalDateTime localDateTime , LocalDate localDate, LocalTime localTime) {
        this.name = name;
        this.localDateTime = localDateTime;
        this.localDate = localDate;
        this.localTime = localTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }
}