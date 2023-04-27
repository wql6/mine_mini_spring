package org.springframework.test.ioc.aop;

import demo20.org.springframework.aop.MethodMatcher;
import demo20.org.springframework.aop.TargetSource;
import demo20.org.springframework.aop.aspectj.AspectJExpressionPointcut;
import demo20.org.springframework.aop.AdvisedSupport;
import demo20.org.springframework.aop.framework.ProxyFactory;
import demo20.org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.ioc.cmmon.WorldServiceBeforeAdvice;
import org.springframework.test.ioc.service.WorldService;
import org.springframework.test.ioc.service.WorldServiceImpl;
import org.springframework.test.ioc.service.WorldServiceInterceptor;

public class Demo19_DynamicProxyTest {

    private AdvisedSupport advisedSupport;

    @Before
    public void setup() {
        WorldService worldService = new WorldServiceImpl();

        advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(worldService);
        WorldServiceInterceptor methodInterceptor = new WorldServiceInterceptor();
        MethodMatcher methodMatcher =  new AspectJExpressionPointcut("execution(* org.springframework.test.ioc.service.WorldService.explode(..))").getMethodMatcher();
        advisedSupport.setTargetSource(targetSource);
        advisedSupport.setMethodInterceptor(methodInterceptor);
        advisedSupport.setMethodMatcher(methodMatcher);
    }


    @Test
    public void testBeforeAdvice() throws Exception {
        //设置BeforeAdvice
        WorldServiceBeforeAdvice beforeAdvice = new WorldServiceBeforeAdvice();
        MethodBeforeAdviceInterceptor methodInterceptor = new MethodBeforeAdviceInterceptor(beforeAdvice);
        advisedSupport.setMethodInterceptor(methodInterceptor);

        WorldService proxy = (WorldService) new ProxyFactory(advisedSupport).getProxy();
        proxy.explode();
    }
}
