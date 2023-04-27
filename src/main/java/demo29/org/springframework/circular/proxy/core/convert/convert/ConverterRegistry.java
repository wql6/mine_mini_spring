package demo29.org.springframework.circular.proxy.core.convert.convert;

import demo29.org.springframework.circular.proxy.core.convert.convert.Converter;
import demo29.org.springframework.circular.proxy.core.convert.convert.ConverterFactory;
import demo29.org.springframework.circular.proxy.core.convert.convert.GenericConverter;

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
