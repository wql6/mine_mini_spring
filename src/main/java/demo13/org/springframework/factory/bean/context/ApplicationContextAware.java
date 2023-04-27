package demo13.org.springframework.factory.bean.context;

import demo13.org.springframework.factory.bean.Aware;
import demo13.org.springframework.factory.bean.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
