package demo30.org.springframework.lazy.context.event;

import demo30.org.springframework.lazy.ApplicationEvent;
import demo30.org.springframework.lazy.context.ApplicationContext;

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
