package demo31.org.springframework.multi.advice.core.convert.convert;

import demo31.org.springframework.multi.advice.core.convert.convert.Converter;
import demo31.org.springframework.multi.advice.core.convert.convert.ConverterFactory;
import demo31.org.springframework.multi.advice.core.convert.convert.GenericConverter;

/**
 * 类型转换器注册接口
 *
 * @author derekyi
 * @date 2021/1/10
 */
public interface ConverterRegistry {

	void addConverter(Converter<?, ?> converter);

	void addConverterFactory(ConverterFactory<?, ?> converterFactory);

	void addConverter(GenericConverter converter);
}
