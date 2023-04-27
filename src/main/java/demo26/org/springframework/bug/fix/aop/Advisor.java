package demo26.org.springframework.bug.fix.aop;

import org.aopalliance.aop.Advice;

public interface Advisor {

    Advice getAdvice();
}
