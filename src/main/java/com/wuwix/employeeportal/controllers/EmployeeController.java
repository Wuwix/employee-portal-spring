package com.wuwix.employeeportal.controllers;

import com.wuwix.employeeportal.dao.EmployeeDao;
import com.wuwix.employeeportal.dao.EmployeeRelationManyService;
import com.wuwix.employeeportal.dao.EmployeeRelationService;
import com.wuwix.employeeportal.domain.*;
import com.wuwix.employeeportal.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("employee")
@RestController
public class EmployeeController {

    @GetMapping("/save")
    public Employee saveUserController() {
        Employee employee = new Employee();
        employee.setFirstName("Wawrzyniec");
        employee.setLastName("Rzeźniak");
        employee.setSalary(20_000.00);
        employee.setLocality("Zamość");
        employee.setZipCode("22-400");
        employee.setStreet("Kilińskiego");
        employee.setStreetNumber(42);

        employeeService.saveEmployee(employee);
        return employee;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {

        employeeService.saveEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/relation/save")
    public EmployeeRelation saveEmployeeRelationController() {
        EmployeeRelation employee = new EmployeeRelation();
        AddressRelation address = new AddressRelation();
        List<Phone> phones = new ArrayList<>();
        employee.setFirstName("Wawrzyniec");
        employee.setLastName("Rzeźniak");
        employee.setSalary(20_000.00);
        address.setLocality("Zamość");
        address.setZipCode("22-400");
        address.setStreet("Kilińskiego");
        address.setStreetNumber(42);
        employee.setAddressRelation(address);

        employeeRelationService.saveEmployee(employee, address);
        return employee;
    }

    //One to many, Unidirectional
    @GetMapping("/relationmany/save")
    public EmployeeRelationMany saveEmployeeRelationManyController() {
        EmployeeRelationMany employee = new EmployeeRelationMany();
        Phone phoneMobile = new Phone("696288111", "mobile");
        Phone phoneHome = new Phone("+486271645", "home");
        List<Phone> phones = new ArrayList<>();
        employee.setFirstName("Wawrzyniec");
        employee.setLastName("Rzeźniak");
        employee.setSalary(20_000.00);
        phones.add(phoneMobile);
        phones.add(phoneHome);
        employee.setPhones(phones);

        employeeRelationManyService.saveEmployee(employee, phones);
        return employee;
    }

//    @CrossOrigin(origins = { "http://localhost:8080", "http://localhost:4201" }, maxAge = 6000)
    @GetMapping("/getbyname/{firstName}")
    public List<Employee> getEmployeesByFirstName(@PathVariable String firstName) {
        return employeeService.getFirstNameLike(firstName);
    }
    @GetMapping("/getall")
    public List<Employee> getUsersController() {
        return employeeService.getAll();
    }

    @GetMapping("relation/getall")
    public List<EmployeeRelation> getEmployeeRelationController() {
        return employeeRelationService.getAll();
    }

    @GetMapping("relationmany/getall")
    public List<EmployeeRelation> getEmployeeRelationManyController() {
        return employeeRelationManyService.getAll();
    }

    @GetMapping("relation/find/{id}")
    public EmployeeRelation getEmployeeById(@PathVariable long id) {
        return employeeRelationService.findById(id);
    }

    @GetMapping("relation/findbyname/{firstName}")
    public List<EmployeeRelation> getEmployeeById(@PathVariable String firstName) {
        return employeeRelationService.findEmployeesByFirstName(firstName);
    }

    @GetMapping("relation/avgofsalary")
    public EmployeeSalaryAvg getEmployeeAvgSalary() {
        return employeeRelationService.getAvgSalary();
    }

    @Autowired
    @Qualifier("employeeServiceSpringImpl")
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRelationService employeeRelationService;

    @Autowired
    private EmployeeRelationManyService employeeRelationManyService;

}
