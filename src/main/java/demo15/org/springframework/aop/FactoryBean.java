package demo15.org.springframework.aop;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
