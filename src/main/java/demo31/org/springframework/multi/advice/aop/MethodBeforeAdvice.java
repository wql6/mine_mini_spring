package demo31.org.springframework.multi.advice.aop;

import demo31.org.springframework.multi.advice.aop.BeforeAdvice;

import java.lang.reflect.Method;

public interface MethodBeforeAdvice extends BeforeAdvice {

    void before(Method method, Object[] args, Object target) throws Throwable;
}
