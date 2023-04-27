package demo23.org.springframework.extension.aop;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
