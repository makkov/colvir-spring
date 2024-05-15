package com.colvir.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaCodeContext {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.colvir.spring");

        Owner owner = context.getBean("owner", Owner.class);
        owner.meetWithAnimal();


        context.close();
    }
}
