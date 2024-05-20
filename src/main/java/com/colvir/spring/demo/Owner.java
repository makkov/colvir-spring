package com.colvir.spring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Owner {

//    @Value("${owner.name}")
//    private String login;

//    Инъекция через поле
//    @Autowired
    private Animal animal;

//    @Autowired
    public Owner(@Qualifier("cat") Animal animal) {
        System.out.println("Создан экземпляр класса Owner");
        this.animal = animal;
    }

    public void meetWithAnimal() {
        System.out.println("Привет, я твой хозяин ");
        animal.say();
    }

//    Инъекция через сеттер
//    @Autowired
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

//    public void setLogin(String login) {
//        this.login = login;
//    }
}
