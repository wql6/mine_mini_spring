package demo30.org.springframework.lazy.core.convert.convert;

import demo30.org.springframework.lazy.core.convert.GenericConversionService;
import demo30.org.springframework.lazy.core.convert.convert.ConverterRegistry;
import demo30.org.springframework.lazy.support.StringToNumberConverterFactory;

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
