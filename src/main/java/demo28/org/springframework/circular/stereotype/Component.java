package demo28.org.springframework.circular.stereotype;

import java.lang.annotation.*;

/**
 * @author derekyi
 * @date 2020/12/26
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

	String value() default "";
}