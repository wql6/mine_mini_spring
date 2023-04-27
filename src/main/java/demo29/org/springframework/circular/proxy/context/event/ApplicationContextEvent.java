package demo29.org.springframework.circular.proxy.context.event;

import demo29.org.springframework.circular.proxy.ApplicationEvent;
import demo29.org.springframework.circular.proxy.context.ApplicationContext;

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
