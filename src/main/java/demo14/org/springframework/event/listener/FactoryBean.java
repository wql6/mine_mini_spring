package demo14.org.springframework.event.listener;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
