package com.wuwix.employeeportal.repositories;

import com.wuwix.employeeportal.domain.Employee;

import java.util.List;

public interface EmployeeRepository {
    public void saveEmployee(Employee employee);
    public List<Employee> getAll();
}
