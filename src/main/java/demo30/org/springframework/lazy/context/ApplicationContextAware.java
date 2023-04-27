package demo30.org.springframework.lazy.context;

import demo30.org.springframework.lazy.Aware;
import demo30.org.springframework.lazy.BeansException;
import demo30.org.springframework.lazy.context.ApplicationContext;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
