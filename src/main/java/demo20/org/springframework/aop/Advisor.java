package demo20.org.springframework.aop;

import org.aopalliance.aop.Advice;

public interface Advisor {

    Advice getAdvice();
}
