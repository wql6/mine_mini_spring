package demo31.org.springframework.multi.advice;

public interface ObjectFactory <T>{
    T getObject() throws BeansException;
}
