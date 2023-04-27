package org.springframework.test.ioc.cmmon;


import demo27.org.springframework.converter.core.convert.convert.Converter;

/**
 * @author derekyi
 * @date 2021/1/16
 */
public class StringToIntegerConverter implements Converter<String, Integer> {
	@Override
	public Integer convert(String source) {
		return Integer.valueOf(source);
	}
}
