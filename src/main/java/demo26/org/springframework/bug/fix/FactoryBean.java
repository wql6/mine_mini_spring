package demo26.org.springframework.bug.fix;

public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
