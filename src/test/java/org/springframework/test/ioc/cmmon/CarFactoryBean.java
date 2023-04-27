package org.springframework.test.ioc.cmmon;

import demo13.org.springframework.factory.bean.factory.FactoryBean;
import org.springframework.test.ioc.bean.Car;

public class CarFactoryBean implements FactoryBean {

    private String brand;
    @Override
    public Object getObject() throws Exception {
        Car car = new Car();
        car.setBrand(brand);
        return car;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
