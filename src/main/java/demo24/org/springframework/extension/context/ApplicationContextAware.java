package demo24.org.springframework.extension.context;

import demo24.org.springframework.extension.Aware;
import demo24.org.springframework.extension.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
