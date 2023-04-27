package org.springframework.test.ioc;

import demo14.org.springframework.event.listener.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.event.CustomEvent;

public class Demo14_EventAndEventListenerTest {


    @Test
    public void  testEventListener() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:demo14-event-and-event-listener.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext));

        System.out.println("ending");
        applicationContext.registerShutdownHook();
    }
}
