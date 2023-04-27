package demo28.org.springframework.circular.context;

import demo28.org.springframework.circular.BeansException;
import demo28.org.springframework.circular.context.ApplicationContext;

public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;


    void close();

    /**
     * 向虚拟机中注册一个钩子方法，在虚拟机关闭之前执行关闭容器等操作
     */
    void registerShutdownHook();
}
