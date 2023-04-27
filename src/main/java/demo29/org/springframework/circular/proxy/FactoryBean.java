package demo29.org.springframework.circular.proxy;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
