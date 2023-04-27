package demo20.org.springframework;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
