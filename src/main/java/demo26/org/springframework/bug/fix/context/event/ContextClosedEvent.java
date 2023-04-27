package demo26.org.springframework.bug.fix.context.event;

import demo26.org.springframework.bug.fix.context.ApplicationContext;

public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
