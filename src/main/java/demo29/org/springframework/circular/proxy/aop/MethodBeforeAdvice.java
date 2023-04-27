package demo29.org.springframework.circular.proxy.aop;

import demo29.org.springframework.circular.proxy.aop.BeforeAdvice;

import java.lang.reflect.Method;

public interface MethodBeforeAdvice extends BeforeAdvice {

    void before(Method method, Object[] args, Object target) throws Throwable;
}
