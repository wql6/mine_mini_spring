package demo25.org.springframework.extension.aop;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
