package sist.com.basic.di9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMain {	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigDemo.class);
		//System.out.println(context.getBean("serverBean"));
		System.out.println(context.getBean("book1"));
		System.out.println(context.getBean("person1"));
		 
	}

}
