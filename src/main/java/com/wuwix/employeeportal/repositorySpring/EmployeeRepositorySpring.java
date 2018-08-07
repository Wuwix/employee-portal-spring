package com.wuwix.employeeportal.repositorySpring;

import com.wuwix.employeeportal.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepositorySpring extends JpaRepository<Employee, Long>, EmployeeRepositorySpringCustom {
}
