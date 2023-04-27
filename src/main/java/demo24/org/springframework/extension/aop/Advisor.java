package demo24.org.springframework.extension.aop;

import org.aopalliance.aop.Advice;

public interface Advisor {

    Advice getAdvice();
}
