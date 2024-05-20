package com.colvir.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlAndAnnotationContext {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationXmlAndAnnotationContext.xml");

//        Animal animal = context.getBean("cat", Animal.class);
//        animal.say();

        Owner owner = context.getBean("owner", Owner.class);
        owner.meetWithAnimal();

        context.close();
    }
}
