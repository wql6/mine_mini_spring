package demo30.org.springframework.lazy.io;

import demo30.org.springframework.lazy.io.Resource;

public interface ResourceLoader {

    Resource getResource(String location);
}
