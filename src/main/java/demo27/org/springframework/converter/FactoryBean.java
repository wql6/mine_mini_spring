package demo27.org.springframework.converter;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
