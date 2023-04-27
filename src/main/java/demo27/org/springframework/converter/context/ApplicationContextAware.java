package demo27.org.springframework.converter.context;

import demo27.org.springframework.converter.Aware;
import demo27.org.springframework.converter.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
