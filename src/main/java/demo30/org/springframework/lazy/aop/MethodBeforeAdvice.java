package demo30.org.springframework.lazy.aop;

import demo30.org.springframework.lazy.aop.BeforeAdvice;

import java.lang.reflect.Method;

public interface MethodBeforeAdvice extends BeforeAdvice {

    void before(Method method, Object[] args, Object target) throws Throwable;
}
