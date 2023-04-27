package org.springframework.test.ioc.aop;

import demo21.org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.service.WorldService;

public class Demo21_AutoProxyTest {
    @Test
    public void testAutoProxy() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:auto-proxy.xml");

        WorldService worldService = applicationContext.getBean("worldService", WorldService.class);
        worldService.explode();

    }
}
