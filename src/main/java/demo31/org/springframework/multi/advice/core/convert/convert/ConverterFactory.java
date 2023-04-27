package demo31.org.springframework.multi.advice.core.convert.convert;

import demo31.org.springframework.multi.advice.core.convert.convert.Converter;

/**
 * 类型转换工厂
 *
 * @author derekyi
 * @date 2021/1/10
 */
public interface ConverterFactory<S, R> {

	<T extends R> Converter<S, T> getConverter(Class<T> targetType);
}