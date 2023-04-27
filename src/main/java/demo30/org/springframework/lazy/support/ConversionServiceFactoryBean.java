package demo30.org.springframework.lazy.support;

import demo30.org.springframework.lazy.FactoryBean;
import demo30.org.springframework.lazy.core.convert.ConversionService;
import demo30.org.springframework.lazy.core.convert.GenericConversionService;
import demo30.org.springframework.lazy.core.convert.convert.*;
import demo9.org.springframework.beans.factory.InitializingBean;

import java.util.Set;

/**
 * @author derekyi
 * @date 2021/1/17
 */
public class ConversionServiceFactoryBean implements FactoryBean<ConversionService>, InitializingBean {

	private Set<?> converters;

	private GenericConversionService conversionService;

	@Override
	public void afterPropertiesSet() throws Exception {
		conversionService = new DefaultConversionService();
		registerConverters(converters, conversionService);
	}

	private void registerConverters(Set<?> converters, ConverterRegistry registry) {
		if (converters != null) {
			for (Object converter : converters) {
				if (converter instanceof GenericConverter) {
					registry.addConverter((GenericConverter) converter);
				} else if (converter instanceof Converter<?, ?>) {
					registry.addConverter((Converter<?, ?>) converter);
				} else if (converter instanceof ConverterFactory<?, ?>) {
					registry.addConverterFactory((ConverterFactory<?, ?>) converter);
				} else {
					throw new IllegalArgumentException("Each converter object must implement one of the " +
							"Converter, ConverterFactory, or GenericConverter interfaces");
				}
			}
		}
	}

	@Override
	public ConversionService getObject() throws Exception {
		return conversionService;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public void setConverters(Set<?> converters) {
		this.converters = converters;
	}
}
