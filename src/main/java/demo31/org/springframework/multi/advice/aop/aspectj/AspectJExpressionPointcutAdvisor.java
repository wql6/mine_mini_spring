package demo31.org.springframework.multi.advice.aop.aspectj;

import demo31.org.springframework.multi.advice.aop.Pointcut;
import demo31.org.springframework.multi.advice.aop.PointcutAdvisor;
import demo31.org.springframework.multi.advice.aop.aspectj.AspectJExpressionPointcut;
import org.aopalliance.aop.Advice;

public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    private AspectJExpressionPointcut pointcut;

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
