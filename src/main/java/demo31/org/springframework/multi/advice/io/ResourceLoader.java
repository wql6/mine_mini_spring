package demo31.org.springframework.multi.advice.io;

import demo31.org.springframework.multi.advice.io.Resource;

public interface ResourceLoader {

    Resource getResource(String location);
}
