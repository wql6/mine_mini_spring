package demo28.org.springframework.circular.core.convert.convert;

import demo28.org.springframework.circular.core.convert.convert.Converter;
import demo28.org.springframework.circular.core.convert.convert.ConverterFactory;
import demo28.org.springframework.circular.core.convert.convert.GenericConverter;

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
