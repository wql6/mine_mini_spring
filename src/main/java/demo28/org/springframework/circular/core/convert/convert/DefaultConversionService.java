package demo28.org.springframework.circular.core.convert.convert;

import demo28.org.springframework.circular.core.convert.GenericConversionService;
import demo28.org.springframework.circular.core.convert.convert.ConverterRegistry;
import demo28.org.springframework.circular.support.StringToNumberConverterFactory;

/**
 * @author derekyi
 * @date 2021/1/16
 */
public class DefaultConversionService extends GenericConversionService {

	public DefaultConversionService() {
		addDefaultConverters(this);
	}

	public static void addDefaultConverters(ConverterRegistry converterRegistry) {
		converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
		//TODO 添加其他ConverterFactory
	}
}
