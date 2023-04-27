package demo30.org.springframework.lazy;

public interface BeanFactory {

    Object getBean(String name);

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;

    boolean containsBean(String name);
}
