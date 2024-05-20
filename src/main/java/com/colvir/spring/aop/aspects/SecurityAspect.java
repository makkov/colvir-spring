package com.colvir.spring.aop.aspects;

import com.colvir.spring.aop.Credentials;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {

    @Around("execution(* *(com.colvir.spring.aop.Credentials, ..))")
    public void checkCreds(ProceedingJoinPoint proceedingJoinPoint) {
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

        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
