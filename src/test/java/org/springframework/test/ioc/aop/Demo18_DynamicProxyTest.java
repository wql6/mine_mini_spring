package org.springframework.test.ioc.aop;

import demo18.org.springframework.aop.aop.MethodMatcher;
import demo18.org.springframework.aop.aop.AdvisedSupport;
import demo18.org.springframework.aop.aop.TargetSource;
import demo18.org.springframework.aop.aop.aspectj.AspectJExpressionPointcut;
import demo18.org.springframework.aop.aop.framework.ProxyFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.ioc.service.WorldService;
import org.springframework.test.ioc.service.WorldServiceImpl;
import org.springframework.test.ioc.service.WorldServiceInterceptor;

public class Demo18_DynamicProxyTest {
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
    public void testProxyFactory() throws Exception {
        // 使用JDK动态代理
        advisedSupport.setProxyTargetClass(false);
        WorldService proxy = (WorldService) new ProxyFactory(advisedSupport).getProxy();
        proxy.explode();

        // 使用CGLIB动态代理
        advisedSupport.setProxyTargetClass(true);
        proxy = (WorldService) new ProxyFactory(advisedSupport).getProxy();
        proxy.explode();
    }
}
