package demo27.org.springframework.converter.aop;

public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
