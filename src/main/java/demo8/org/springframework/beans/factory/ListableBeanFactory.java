package demo8.org.springframework.beans.factory;

import demo8.org.springframework.beans.BeanFactory;
import demo8.org.springframework.beans.BeansException;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory {

    <T>Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    String[] getBeanDefinitionNames();
}
