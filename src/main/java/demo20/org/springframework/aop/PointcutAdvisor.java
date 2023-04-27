package demo20.org.springframework.aop;

public interface PointcutAdvisor extends Advisor{

    Pointcut getPointcut();
}
