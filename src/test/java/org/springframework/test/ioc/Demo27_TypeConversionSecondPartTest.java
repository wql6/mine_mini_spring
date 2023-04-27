package org.springframework.test.ioc;

import demo27.org.springframework.converter.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.convert.Car;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class Demo27_TypeConversionSecondPartTest {

    @Test
    public void testConversionService() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:type-conversion-second-part.xml");

        Car car = applicationContext.getBean("car", Car.class);
        assertThat(car.getPrice()).isEqualTo(1000000);
        assertThat(car.getProduceDate()).isEqualTo(LocalDate.of(2021, 1, 1));
    }
}
