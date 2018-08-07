package com.wuwix.employeeportal.services;

import com.wuwix.employeeportal.domain.Employee;

import java.util.List;

public interface EmployeeService {
    public void saveEmployee(Employee employee);
    public List<Employee> getAll();
    public List<Employee> getFirstNameLike(String firstName);
}
