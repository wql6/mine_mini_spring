package demo22.org.springframework.extension;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
