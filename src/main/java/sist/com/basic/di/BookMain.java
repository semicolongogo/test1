package sist.com.basic.di;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BookMain {	
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("src/main/java/sist/com/basic/di/book.xml");
		//Book book=(Book)context.getBean("book1");
		//System.out.println(book);
		/*((Book)context.getBean("book1")).setBookName("�ؽ�");
		System.out.println(((Book)context.getBean("book1")));*/
		
		//((Book)context.getBean("book1")).setBookName("�ĸ����");;//author[�ĸ����]
	   // System.out.println(((Book)context.getBean("book1")).getBookName());
		Store store=(Store)context.getBean("store1");
		/*for(Book b:store.getList()) {
			System.out.println(b);
		}*/
		/*Set<Book>set=store.getSet();
		Iterator<Book>iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}*/
		/*Map<Integer, Book>map=store.getMap();
		
		Iterator<Entry<Integer, Book>>iter=map.entrySet().iterator();
		while(iter.hasNext()) {
		  Entry<Integer, Book>entry=iter.next();
		  System.out.println("key="+entry.getKey()+" :"+entry.getValue());
		}
		*/
		Properties properties=store.getProperties();
		Enumeration<Object>e=properties.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}





