package org.springframework.test.ioc;

import demo13.org.springframework.factory.bean.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.bean.Car;
import org.springframework.test.ioc.cmmon.CarFactoryBean;

import static org.assertj.core.api.Assertions.assertThat;

public class Demo13_FactoryBeanTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:demo13-factory-bean.xml");
        Car car = applicationContext.getBean("car", Car.class);
        assertThat(car.getBrand()).isEqualTo("porsche");
    }
}
