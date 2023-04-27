package demo24.org.springframework.extension;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
