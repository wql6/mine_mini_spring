package demo28.org.springframework.circular.context;

import demo28.org.springframework.circular.Aware;
import demo28.org.springframework.circular.BeansException;
import demo28.org.springframework.circular.context.ApplicationContext;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
