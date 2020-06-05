package sist.com.basic.di9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource(locations= {"classpath:/sist/com/basic/di/book.xml",
		               "classpath:/sist/com/basic/di2/person.xml"})
public class ConfigDemo {
	@Bean(name="serverBean")
	public StreamServer getStreamServer() {
		return new StreamServer("JavaStream", 100, "211.63.89.100");
	}
	@Bean(name="beanServer")
	public StreamServer getUserSever() {
		StreamServer server=new StreamServer();
		server.setCount(500);
		server.setUrl("211.63.89.100");
		return new StreamServer("JavaStream", 100, "211.63.89.100");
	}

}





