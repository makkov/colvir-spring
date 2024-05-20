package com.colvir.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void printAll())")
    public void printAllLogging() {
        System.out.println("Вызван метод printAll");
    }

    @Before("execution(public void print*())")
    public void printPatternLogging() {
        System.out.println("Вызван метод print*");
    }
}
