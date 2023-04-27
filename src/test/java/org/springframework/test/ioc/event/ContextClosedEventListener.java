package org.springframework.test.ioc.event;

import demo14.org.springframework.event.listener.context.ApplicationListener;
import demo14.org.springframework.event.listener.context.event.ContextClosedEvent;

public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println(this.getClass().getName());
    }
}
