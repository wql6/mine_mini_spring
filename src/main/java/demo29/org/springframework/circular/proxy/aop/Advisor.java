package demo29.org.springframework.circular.proxy.aop;

import org.aopalliance.aop.Advice;

public interface Advisor {

    Advice getAdvice();
}
