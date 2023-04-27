package demo30.org.springframework.lazy.aop;

import org.aopalliance.aop.Advice;

public interface Advisor {

    Advice getAdvice();
}
