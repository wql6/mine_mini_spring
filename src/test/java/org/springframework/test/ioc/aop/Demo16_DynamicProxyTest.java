package org.springframework.test.ioc.aop;

import demo16.org.springframework.aop.aop.AdvisedSupport;
import demo16.org.springframework.aop.aop.MethodMatcher;
import demo16.org.springframework.aop.aop.TargetSource;
import demo16.org.springframework.aop.aop.aspectj.AspectJExpressionPointcut;
import demo16.org.springframework.aop.aop.framework.JdkDynamicAopProxy;
import org.aspectj.weaver.World;
import org.junit.Test;
import org.springframework.test.ioc.service.WorldService;
import org.springframework.test.ioc.service.WorldServiceImpl;
import org.springframework.test.ioc.service.WorldServiceInterceptor;

public class Demo16_DynamicProxyTest {

    @Test
    public void testJdkDynamicProxy() throws Exception{
        WorldService worldService = new WorldServiceImpl();

        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(worldService);

        WorldServiceInterceptor worldServiceInterceptor = new WorldServiceInterceptor();
        MethodMatcher methodMatcher =  new AspectJExpressionPointcut("execution(* org.springframework.test.ioc.service.WorldService.explode(..))").getMethodMatcher();
        advisedSupport.setTargetSource(targetSource);
        advisedSupport.setMethodInterceptor(worldServiceInterceptor);
        advisedSupport.setMethodMatcher(methodMatcher);

        WorldService proxy = (WorldService) new JdkDynamicAopProxy(advisedSupport).getProxy();
        proxy.explode();

    }
}
