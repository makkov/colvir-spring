package com.colvir.spring;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.say();
        dog.say();
    }
}
