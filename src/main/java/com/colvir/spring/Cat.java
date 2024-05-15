package com.colvir.spring;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    public Cat() {
        System.out.println("Создан экземпляр класса Cat");
    }

    @Override
    public void say() {
        System.out.println("Мяу");
    }

    public void init() {
        System.out.println("Делаем что-то в init методе");
    }

    public void destroy() {
        System.out.println("Делаем что-то в destroy методе");
    }
}
