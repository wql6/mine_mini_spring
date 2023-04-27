package demo28.org.springframework.circular.aop;

import org.aopalliance.aop.Advice;

public interface Advisor {

    Advice getAdvice();
}
