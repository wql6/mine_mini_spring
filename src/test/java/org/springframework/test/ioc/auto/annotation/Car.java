package org.springframework.test.ioc.auto.annotation;


import demo25.org.springframework.extension.annotaion.Value;
import demo25.org.springframework.extension.stereotype.Component;

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
