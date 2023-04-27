package org.springframework.test.ioc;

import demo24.org.springframework.extension.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.annotation.Car;
import static org.assertj.core.api.Assertions.assertThat;

public class Demo24_ValueAnnotationTest {

    @Test
    public void testValueAnnotation() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:value-annotation.xml");

        Car car = applicationContext.getBean("car", Car.class);
        assertThat(car.getBrand()).isEqualTo("lamborghini");
    }
}
