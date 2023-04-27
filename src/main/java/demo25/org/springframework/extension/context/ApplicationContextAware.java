package demo25.org.springframework.extension.context;

import demo25.org.springframework.extension.Aware;
import demo25.org.springframework.extension.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
