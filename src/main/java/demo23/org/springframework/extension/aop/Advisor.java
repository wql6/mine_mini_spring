package demo23.org.springframework.extension.aop;

import org.aopalliance.aop.Advice;

public interface Advisor {

    Advice getAdvice();
}
