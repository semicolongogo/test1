package sist.com.basic.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CommandMain {	
	public static void main(String[] args) {
		ApplicationContext app=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic/aop2/unit.xml");
		Unit unit=(Unit)app.getBean("marine");
		unit.doCommand();
	}

}
