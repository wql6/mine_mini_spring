package org.springframework.test.ioc.expanding;

import demo22.org.springframework.extension.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.bean.Car;

import static org.assertj.core.api.Assertions.assertThat;

public class PropertyPlaceholderConfigurerTest {

    @Test
    public void test() {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:demo22-property-placeholder-configurer.xml");

        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car.getBrand());
        assertThat(car.getBrand()).isEqualTo("lamborghini");
    }
}
