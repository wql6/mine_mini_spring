package demo29.org.springframework.circular.proxy.io;

import demo29.org.springframework.circular.proxy.io.ClassPathResource;
import demo29.org.springframework.circular.proxy.io.FileSystemResource;
import demo29.org.springframework.circular.proxy.io.Resource;
import demo29.org.springframework.circular.proxy.io.ResourceLoader;
import demo29.org.springframework.circular.proxy.io.UrlResource;

import java.net.MalformedURLException;
import java.net.URL;

public class DefaultResourceLoader implements ResourceLoader {


    public static final String CLASSPATH_URL_PREFIX = "classpath:";
    @Override
    public Resource getResource(String location) {
        if(location.startsWith(CLASSPATH_URL_PREFIX)){
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        }else {
            try {
                //尝试当成url来处理
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException ex) {
                //当成文件系统下的资源处理
                return new FileSystemResource(location);
            }
        }
    }
}
