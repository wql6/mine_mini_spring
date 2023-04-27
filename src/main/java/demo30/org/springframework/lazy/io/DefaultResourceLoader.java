package demo30.org.springframework.lazy.io;

import demo30.org.springframework.lazy.io.ClassPathResource;
import demo30.org.springframework.lazy.io.FileSystemResource;
import demo30.org.springframework.lazy.io.Resource;
import demo30.org.springframework.lazy.io.ResourceLoader;
import demo30.org.springframework.lazy.io.UrlResource;

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