package com.wuwix.employeeportal.services;

import com.wuwix.employeeportal.domain.Employee;
import com.wuwix.employeeportal.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    @Qualifier("employeeRepositoryImpl")
    EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.getAll();
    }

    @Override
    public List<Employee> getFirstNameLike(String firstName) {
        return null;
    }
}
