package demo13.org.springframework.factory.bean.factory;

import demo13.org.springframework.factory.bean.BeanFactory;
import demo13.org.springframework.factory.bean.BeansException;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory {

    <T>Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    String[] getBeanDefinitionNames();
}
