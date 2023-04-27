package demo10.org.springframework.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String name);
}
