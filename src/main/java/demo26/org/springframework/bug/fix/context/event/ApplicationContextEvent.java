package demo26.org.springframework.bug.fix.context.event;

import demo26.org.springframework.bug.fix.ApplicationEvent;
import demo26.org.springframework.bug.fix.context.ApplicationContext;

/**
 * @author derekyi
 * @date 2020/12/2
 */
public abstract class ApplicationContextEvent extends ApplicationEvent {

	public ApplicationContextEvent(ApplicationContext source) {
		super(source);
	}

	public final ApplicationContext getApplicationContext() {
		return (ApplicationContext) getSource();
	}
}
