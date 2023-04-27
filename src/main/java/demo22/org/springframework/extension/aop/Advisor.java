package demo22.org.springframework.extension.aop;

import org.aopalliance.aop.Advice;

public interface Advisor {

    Advice getAdvice();
}
