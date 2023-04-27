package demo30.org.springframework.lazy.aop;

import demo30.org.springframework.lazy.aop.ClassFilter;
import demo30.org.springframework.lazy.aop.MethodMatcher;

public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
