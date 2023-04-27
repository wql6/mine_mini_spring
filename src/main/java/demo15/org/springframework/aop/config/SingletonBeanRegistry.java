package demo15.org.springframework.aop.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void addSingleton(String beanName, Object singletonObject);
}
