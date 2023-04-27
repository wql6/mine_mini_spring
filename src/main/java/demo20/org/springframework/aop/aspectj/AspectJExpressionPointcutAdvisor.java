package demo20.org.springframework.aop.aspectj;

import demo20.org.springframework.aop.Advisor;
import demo20.org.springframework.aop.Pointcut;
import demo20.org.springframework.aop.PointcutAdvisor;
import org.aopalliance.aop.Advice;

public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    private AspectJExpressionPointcut pointcut;

    private Advice advice;

    private String expression;

    public void setExpression(String expression){
        this.expression = expression;
        pointcut = new AspectJExpressionPointcut(expression);
    }


    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }
}
