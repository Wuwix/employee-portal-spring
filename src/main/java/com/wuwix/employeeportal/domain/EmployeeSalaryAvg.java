package com.wuwix.employeeportal.domain;

public class EmployeeSalaryAvg {
    private Double avgSalary;
    private Double max;
    private Double min;

    public EmployeeSalaryAvg(Double avgSalary, Double max, Double min) {
        this.avgSalary = avgSalary;
        this.max = max;
        this.min = min;
    }

    public Double getAvgSalary() {
        return avgSalary;
    }

    public Double getMax() {
        return max;
    }

    public Double getMin() {
        return min;
    }
}

