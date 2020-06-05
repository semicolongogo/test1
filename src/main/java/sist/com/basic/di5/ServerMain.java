package sist.com.basic.di5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServerMain {
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic/di5/ws.xml");
	 	WebServer webServer=(WebServer)context.getBean("web");
	 	System.out.println(webServer);
	}

}
