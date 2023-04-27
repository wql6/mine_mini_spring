package demo21.org.springframework.aop;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
