package demo31.org.springframework.multi.advice.context.event;

import demo31.org.springframework.multi.advice.context.ApplicationContext;
import demo31.org.springframework.multi.advice.context.event.ApplicationContextEvent;

/**
 * @author derekyi
 * @date 2020/12/2
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

	public ContextRefreshedEvent(ApplicationContext source) {
		super(source);
	}
}
