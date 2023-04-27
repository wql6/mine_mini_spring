package demo21.org.springframework.context.event;

import demo21.org.springframework.ApplicationEvent;
import demo21.org.springframework.context.ApplicationContext;

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
