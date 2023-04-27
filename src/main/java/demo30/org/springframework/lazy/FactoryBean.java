package demo30.org.springframework.lazy;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
