package demo3.org.springframework.beans.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String name);
}
