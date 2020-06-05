package sist.com.basic.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServiceMain {
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic/di3/service.xml");
		Service service=(Service) context.getBean("serviceClient");
		service.findUser();
	} 

}
