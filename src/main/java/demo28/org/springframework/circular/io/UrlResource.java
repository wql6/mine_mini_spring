package demo28.org.springframework.circular.io;

import demo28.org.springframework.circular.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author derekyi
 * @date 2020/11/25
 */
public class UrlResource implements Resource {

	private final URL url;

	public UrlResource(URL url) {
		this.url = url;
	}

	@Override
	public InputStream getInputStream() throws IOException {
		URLConnection con = this.url.openConnection();
		try {
			return con.getInputStream();
		} catch (IOException ex) {
			throw ex;
		}
	}
}
