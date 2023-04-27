package demo17.org.springframework.aop;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
