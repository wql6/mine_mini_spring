package demo29.org.springframework.circular.proxy.core.convert.convert;

/**
 * 类型转换抽象接口
 *
 * @author derekyi
 * @date 2021/1/10
 */
public interface Converter<S, T> {

	/**
	 * 类型转换
	 */
	T convert(S source);
}
