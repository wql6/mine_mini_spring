package org.springframework.test.ioc;

import demo28.org.springframework.circular.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.circule.A;
import org.springframework.test.ioc.circule.B;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class Demo28_CircularReferenceWithoutProxyBeanTest {

    @Test
    public void testCircularReference(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:circular-reference-without-proxy-bean.xml");
        A a = applicationContext.getBean("a", A.class);
        B b = applicationContext.getBean("b", B.class);
        assertThat(a.getB() == b).isTrue();
    }
}
