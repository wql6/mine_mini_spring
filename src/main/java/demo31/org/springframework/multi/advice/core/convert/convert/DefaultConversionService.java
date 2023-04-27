package demo31.org.springframework.multi.advice.core.convert.convert;

import demo31.org.springframework.multi.advice.core.convert.GenericConversionService;
import demo31.org.springframework.multi.advice.core.convert.convert.ConverterRegistry;
import demo31.org.springframework.multi.advice.support.StringToNumberConverterFactory;

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
