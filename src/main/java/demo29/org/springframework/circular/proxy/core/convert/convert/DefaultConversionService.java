package demo29.org.springframework.circular.proxy.core.convert.convert;

import demo29.org.springframework.circular.proxy.core.convert.GenericConversionService;
import demo29.org.springframework.circular.proxy.core.convert.convert.ConverterRegistry;
import demo29.org.springframework.circular.proxy.support.StringToNumberConverterFactory;

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
