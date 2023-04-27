package demo28.org.springframework.circular.io;

import demo28.org.springframework.circular.io.Resource;

public interface ResourceLoader {

    Resource getResource(String location);
}
