package demo25.org.springframework.extension;

public interface BeanFactory {

    Object getBean(String name);

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;
}
