package demo29.org.springframework.circular.proxy.context.event;

import demo29.org.springframework.circular.proxy.context.ApplicationContext;
import demo29.org.springframework.circular.proxy.context.event.ApplicationContextEvent;

/**
 * @author derekyi
 * @date 2020/12/2
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

	public ContextRefreshedEvent(ApplicationContext source) {
		super(source);
	}
}
