package demo28.org.springframework.circular;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
