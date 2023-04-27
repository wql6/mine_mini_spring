package org.springframework.test.ioc;

import demo23.org.springframework.extension.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.bean.Car;
import org.springframework.test.ioc.bean.Person;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class Demo23_PackageScanTest {


    @Test
    public void testScanPackage(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:package-scan.xml");

        Car car = applicationContext.getBean("car", Car.class);
        assertThat(car).isNotNull();
    }
}
