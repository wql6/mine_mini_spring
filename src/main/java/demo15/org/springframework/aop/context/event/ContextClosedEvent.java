package demo15.org.springframework.aop.context.event;

import demo15.org.springframework.aop.context.ApplicationContext;

public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
