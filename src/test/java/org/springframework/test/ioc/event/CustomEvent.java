package org.springframework.test.ioc.event;

import demo14.org.springframework.event.listener.context.ApplicationContext;
import demo14.org.springframework.event.listener.context.event.ApplicationContextEvent;

public class CustomEvent extends ApplicationContextEvent {

    public CustomEvent(ApplicationContext source) {
        super(source);
    }
}
