package org.springframework.test.ioc.bean;

import demo23.org.springframework.extension.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * @author derekyi
 * @date 2020/11/24
 */
@Component
public class Car {

	private String brand;

	private long date;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void init() {
		date = System.currentTimeMillis();
	}

	public void showTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
		System.out.println(date + ":bean create");
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				'}';
	}
}
