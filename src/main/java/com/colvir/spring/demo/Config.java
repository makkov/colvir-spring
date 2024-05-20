package com.colvir.spring.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {

//    @Bean - нужно убрать аннотацию @Component у Dog и Cat
//    public Animal catBean() {
//        return new Cat();
//    }
//
//    @Bean - нужно убрать аннотацию @Component у Owner
//    public Owner ownerBean() {
//        return new Owner(catBean());
//    }
}
