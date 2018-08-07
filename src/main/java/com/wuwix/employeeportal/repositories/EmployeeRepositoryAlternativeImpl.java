package com.wuwix.employeeportal.repositories;

import com.wuwix.employeeportal.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository()
public class EmployeeRepositoryAlternativeImpl implements EmployeeRepository {
    @Override
    public void saveEmployee(Employee employee) {
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.setFirstName("Waw");
        employee1.setLastName("Rz");
        employee2.setFirstName("Mari");
        employee2.setLastName("Rze");
        employee3.setFirstName("Mare");
        employee3.setLastName("Rze");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        return employees;
    }
}
