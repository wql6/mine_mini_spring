package demo30.org.springframework.lazy;

public interface ObjectFactory <T>{
    T getObject() throws BeansException;
}
