package sist.com.basic.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonMain {	
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic/di2/person.xml");
		//System.out.println(context.getBean("person1")==context.getBean("person2"));
		System.out.println(context.getBean("society1"));
	}

}
