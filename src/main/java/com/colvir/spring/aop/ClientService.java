package com.colvir.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class ClientService {


    public void printAll() {
        System.out.println("printAll from ClientService");
    }
}
