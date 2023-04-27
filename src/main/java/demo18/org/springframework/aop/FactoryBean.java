package demo18.org.springframework.aop;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
