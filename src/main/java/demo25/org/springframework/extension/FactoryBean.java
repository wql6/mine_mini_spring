package demo25.org.springframework.extension;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
