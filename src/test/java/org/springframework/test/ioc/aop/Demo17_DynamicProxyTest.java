package org.springframework.test.ioc.aop;

import demo16.org.springframework.aop.aop.framework.CglibAopProxy;
import demo17.org.springframework.aop.AdvisedSupport;
import demo17.org.springframework.aop.JdkDynamicAopProxy;
import demo17.org.springframework.aop.MethodMatcher;
import demo17.org.springframework.aop.TargetSource;
import demo17.org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.ioc.service.WorldService;
import org.springframework.test.ioc.service.WorldServiceImpl;
import org.springframework.test.ioc.service.WorldServiceInterceptor;

public class Demo17_DynamicProxyTest {


    private AdvisedSupport advisedSupport;


    @Before
    public void setup() {
        WorldService worldService = new WorldServiceImpl();

        advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(worldService);
        WorldServiceInterceptor worldServiceInterceptor = new WorldServiceInterceptor();

        MethodMatcher methodMatcher =  new AspectJExpressionPointcut("execution(* org.springframework.test.ioc.service.WorldService.explode(..))").getMethodMatcher();
        advisedSupport.setTargetSource(targetSource);
        advisedSupport.setMethodInterceptor(worldServiceInterceptor);
        advisedSupport.setMethodMatcher(methodMatcher);
    }

    @Test
    public void testJdkDynamicProxy() throws Exception {
        WorldService proxy = (WorldService) new JdkDynamicAopProxy(advisedSupport).getProxy();
        proxy.explode();
    }

    @Test
    public void testCglibDynamicProxy() throws Exception {
        WorldService proxy = (WorldService) new CglibAopProxy(advisedSupport).getProxy();
        proxy.explode();
    }



}
