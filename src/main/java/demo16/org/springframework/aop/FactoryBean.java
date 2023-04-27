package demo16.org.springframework.aop;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
