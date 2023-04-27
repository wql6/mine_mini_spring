package demo29.org.springframework.circular.proxy.aop;

import demo29.org.springframework.circular.proxy.aop.ClassFilter;
import demo29.org.springframework.circular.proxy.aop.MethodMatcher;

public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
