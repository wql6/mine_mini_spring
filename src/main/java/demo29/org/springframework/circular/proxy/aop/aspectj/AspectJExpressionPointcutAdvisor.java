package demo29.org.springframework.circular.proxy.aop.aspectj;

import demo29.org.springframework.circular.proxy.aop.Pointcut;
import demo29.org.springframework.circular.proxy.aop.PointcutAdvisor;
import demo29.org.springframework.circular.proxy.aop.aspectj.AspectJExpressionPointcut;
import org.aopalliance.aop.Advice;

public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    private demo29.org.springframework.circular.proxy.aop.aspectj.AspectJExpressionPointcut pointcut;

    private Advice advice;

    private String expression;

    public void setExpression(String expression){
        this.expression = expression;
    }


    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        if (pointcut == null) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }
}
