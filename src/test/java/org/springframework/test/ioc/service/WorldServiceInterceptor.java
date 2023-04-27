package org.springframework.test.ioc.service;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class WorldServiceInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Do something before the explodes");
        Object proceed = methodInvocation.proceed();
        System.out.println("Do something after the explodes");
        return proceed;
    }
}
