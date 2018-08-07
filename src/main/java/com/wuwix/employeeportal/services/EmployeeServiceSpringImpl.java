package com.wuwix.employeeportal.services;

import com.wuwix.employeeportal.domain.Employee;
import com.wuwix.employeeportal.repositories.EmployeeRepository;
import com.wuwix.employeeportal.repositorySpring.EmployeeRepositorySpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceSpringImpl implements EmployeeService {

    @Autowired
    EmployeeRepositorySpring employeeRepositorySpring;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepositorySpring.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepositorySpring.findAll();
    }

    @Override
    public List<Employee> getFirstNameLike(String firstName) {
        return employeeRepositorySpring.getFirstNameLike(firstName);
    }
}
