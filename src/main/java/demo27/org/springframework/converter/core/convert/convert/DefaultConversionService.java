package demo27.org.springframework.converter.core.convert.convert;

import demo27.org.springframework.converter.core.convert.GenericConversionService;
import demo27.org.springframework.converter.support.StringToNumberConverterFactory;

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
