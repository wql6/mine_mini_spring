package demo31.org.springframework.multi.advice.aop;

import demo31.org.springframework.multi.advice.aop.Advisor;
import demo31.org.springframework.multi.advice.aop.Pointcut;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
