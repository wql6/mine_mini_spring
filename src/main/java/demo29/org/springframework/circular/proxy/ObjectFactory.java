package demo29.org.springframework.circular.proxy;

public interface ObjectFactory <T>{
    T getObject() throws BeansException;
}
