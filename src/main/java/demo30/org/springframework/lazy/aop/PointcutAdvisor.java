package demo30.org.springframework.lazy.aop;

import demo30.org.springframework.lazy.aop.Advisor;
import demo30.org.springframework.lazy.aop.Pointcut;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
