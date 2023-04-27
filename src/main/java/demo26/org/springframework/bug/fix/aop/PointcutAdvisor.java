package demo26.org.springframework.bug.fix.aop;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
