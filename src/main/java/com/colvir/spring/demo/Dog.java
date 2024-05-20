package com.colvir.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    @Override
    public void say() {
        System.out.println("Гав");
    }
}
