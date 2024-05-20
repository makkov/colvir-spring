package com.colvir.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(public void print*())")
    public void printPatternMethod() {

    }

    @Before("printPatternMethod()")
    public void printPatternLogging() {
        System.out.println("Вызван метод print*");
    }

    @Before("printPatternMethod()")
    public void printPatternLogging2() {
        System.out.println("Повторное напоминание: вызван метод print*");
    }

    @Before("execution(* *())")
    public void printAllEmptyMethodsCall() {
        System.out.println("Вызван метод без аргументов");
    }

    @Before("execution(* *(String, String))")
    public void printTwoInputStringsCall() {
        System.out.println("Вызван метод, который на входе принимает две строки");
    }

    @Before("execution(* *(..))")
    public void printAllMethodsCall() {
        System.out.println("Вызывается любой метод");
    }
}
