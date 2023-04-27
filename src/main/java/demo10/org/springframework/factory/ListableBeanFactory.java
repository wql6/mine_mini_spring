package demo10.org.springframework.factory;

import demo10.org.springframework.BeanFactory;
import demo10.org.springframework.BeansException;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory {

    <T>Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    String[] getBeanDefinitionNames();
}
