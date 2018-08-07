package com.wuwix.employeeportal.repositorySpring;

import com.wuwix.employeeportal.domain.Employee;

import java.util.List;

public interface EmployeeRepositorySpringCustom {
    List<Employee> getFirstNameLike(String firstName);
}
