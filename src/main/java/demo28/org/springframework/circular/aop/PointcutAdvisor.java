package demo28.org.springframework.circular.aop;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
