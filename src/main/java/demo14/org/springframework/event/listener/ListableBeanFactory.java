package demo14.org.springframework.event.listener;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory {

    <T>Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    String[] getBeanDefinitionNames();
}
