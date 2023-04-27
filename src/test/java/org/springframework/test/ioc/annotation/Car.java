package org.springframework.test.ioc.annotation;

import demo24.org.springframework.extension.stereotype.Component;
import demo24.org.springframework.extension.annotaion.Value;

/**
 * @author derekyi
 * @date 2020/11/24
 */
@Component
public class Car {

	@Value("${brand}")
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				'}';
	}
}
