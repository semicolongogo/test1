package sist.com.basic.di8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ActionMain {
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic/di8/action.xml");
		System.out.println(context.getBean("servletAction"));
	}

}
