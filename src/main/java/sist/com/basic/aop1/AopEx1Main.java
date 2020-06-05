package sist.com.basic.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AopEx1Main {	
	public static void main(String[] args) {		
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic/aop1/aop1.xml");		
		Dao dao=(Dao)context.getBean("myBatisDao");
		/*dao.selectData();//ÇÙ½ÉÄÚµå 
		dao.selectData(100);//ÇÙ½ÉÄÚµå 
*/		
//		dao.insertProcess();
		dao.updateProcess();
		
	}

}
