package com.colvir.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlContext {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationXmlContext.xml");

//        Animal animal = context.getBean("animalBean", Animal.class);

//        Owner owner = new Owner(animal);
//        owner.meetWithAnimal();

        //Получаем владельца из контекста
        Owner owner = context.getBean("ownerBean", Owner.class);
        owner.meetWithAnimal();

//        Демонстрация поведения в зависимости от выбранного скоупа
//        Animal animal1 = context.getBean("animalBean", Animal.class);
//        Animal animal2 = context.getBean("animalBean", Animal.class);
//
//        boolean animal1IsAnimal2 = animal1 == animal2;
//        System.out.println("animal1 и animal2 - один и тот же объект: " + animal1IsAnimal2);

        context.close();
    }
}
