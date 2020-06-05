package sist.com.basic.di6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DiproMain {	
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic/di6/diPro.xml");
		System.out.println(context.getBean("my"));
		
	}

}
