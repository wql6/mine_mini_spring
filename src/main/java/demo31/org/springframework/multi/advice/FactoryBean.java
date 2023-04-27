package demo31.org.springframework.multi.advice;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
