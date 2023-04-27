package org.springframework.test.ioc;

import demo12.org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.bean.Car;
import static org.assertj.core.api.Assertions.assertThat;

public class PrototypeBeanTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:demo12-prototype-bean.xml");
        Car car1 = applicationContext.getBean("car", Car.class);
        Car car2 = applicationContext.getBean("car", Car.class);
        assertThat(car1 != car2).isTrue();
    }
}
