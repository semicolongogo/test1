package sist.com.basic.di7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServerMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic/di7/db.xml");
		System.out.println(context.getBean("serverSystem"));
	}

}
