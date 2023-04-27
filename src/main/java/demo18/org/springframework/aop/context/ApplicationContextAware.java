package demo18.org.springframework.aop.context;

import demo18.org.springframework.aop.Aware;
import demo18.org.springframework.aop.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
