package demo29.org.springframework.circular.proxy.aop;

import demo29.org.springframework.circular.proxy.aop.Advisor;
import demo29.org.springframework.circular.proxy.aop.Pointcut;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
