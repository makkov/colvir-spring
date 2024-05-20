package com.colvir.spring.aop.aspects;

import com.colvir.spring.aop.Credentials;
import com.colvir.spring.aop.Employee;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {

    @Around("execution(* *(com.colvir.spring.aop.Credentials, ..))")
    public Employee checkCreds(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Был вызван метод " + proceedingJoinPoint.getSignature().getName());

        Object[] objects = proceedingJoinPoint.getArgs();

        Credentials credentials = null;

        for (Object obj : objects) {
            if (obj instanceof Credentials) {
                credentials = (Credentials) obj;
            }
        }

        if (credentials == null) {
            throw new RuntimeException("Проблема извлечения логина/пароля");
        }


        if (!credentials.getPassword().equals(credentials.getConfirmPassword())) {
            throw new RuntimeException("Пароли не совпадают!");
        }

        Employee employee = null;

        try {
            employee = (Employee) proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        employee.setSecondName("Товарищ " + employee.getSecondName());

        return employee;
    }
}
