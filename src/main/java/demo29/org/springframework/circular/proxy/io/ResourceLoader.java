package demo29.org.springframework.circular.proxy.io;

import demo29.org.springframework.circular.proxy.io.Resource;

public interface ResourceLoader {

    Resource getResource(String location);
}
