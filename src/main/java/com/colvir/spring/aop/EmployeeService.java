package com.colvir.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public void add(Credentials credentials, String name, String secondName) {
        Employee newEmployee = new Employee(name, secondName);
        employees.add(newEmployee);
    }

    public void printAll() {
        System.out.println(employees);
    }

    public void printFirst() {
        System.out.println(employees.get(0));
    }
}
