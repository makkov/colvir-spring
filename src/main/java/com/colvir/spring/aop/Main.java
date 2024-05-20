package com.colvir.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

        employeeService.add("Ivan", "Ivanov");
        employeeService.add("Petr", "Petrov");

        employeeService.printAll();
        employeeService.printFirst();

        ClientService clientService = context.getBean("clientService", ClientService.class);
        clientService.printAll();

        context.close();
    }
}
