package org.springframework.test.ioc.event;

import demo14.org.springframework.event.listener.context.ApplicationListener;
import demo14.org.springframework.event.listener.context.event.ContextRefreshedEvent;

public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(this.getClass().getName());
    }
}
