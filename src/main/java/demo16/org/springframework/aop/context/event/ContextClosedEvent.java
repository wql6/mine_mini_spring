package demo16.org.springframework.aop.context.event;

import demo16.org.springframework.aop.context.ApplicationContext;

public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
