package demo28.org.springframework.circular.context.event;

import demo28.org.springframework.circular.context.ApplicationContext;
import demo28.org.springframework.circular.context.event.ApplicationContextEvent;

/**
 * @author derekyi
 * @date 2020/12/2
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

	public ContextRefreshedEvent(ApplicationContext source) {
		super(source);
	}
}
