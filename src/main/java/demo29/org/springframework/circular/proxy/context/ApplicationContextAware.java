package demo29.org.springframework.circular.proxy.context;

import demo29.org.springframework.circular.proxy.Aware;
import demo29.org.springframework.circular.proxy.BeansException;
import demo29.org.springframework.circular.proxy.context.ApplicationContext;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
