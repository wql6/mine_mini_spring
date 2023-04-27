package org.springframework.test.ioc;

import demo10.org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

public class Demo10_InitAndDestoryMethodTest {

    @Test
    public void testInitAndDestroyMethod() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:init-and-destroy-method.xml");
        applicationContext.registerShutdownHook();
    }
}
