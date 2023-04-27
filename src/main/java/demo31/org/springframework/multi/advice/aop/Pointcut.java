package demo31.org.springframework.multi.advice.aop;

import demo31.org.springframework.multi.advice.aop.ClassFilter;
import demo31.org.springframework.multi.advice.aop.MethodMatcher;

public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
