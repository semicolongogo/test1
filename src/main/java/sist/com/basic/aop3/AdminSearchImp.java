package sist.com.basic.aop3;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="search")
public class AdminSearchImp  implements Search{
	//@Autowired
	//@Resource
	@Inject
	private FileProcess file;
	public void fileSearch() {
		// TODO Auto-generated method stub
		file.fileValidate();
		System.out.println("fileSearch");
		file.fileProperties();
	}
	@Override
	public void xmlParsing() {
		// TODO Auto-generated method stub
		System.out.println("xmlParsing");
	}
	@Override
	public void domSaxPasing() {
		// TODO Auto-generated method stub
		System.out.println("domSaxPasing");	
		
	}
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("AdminProcess");
	}
	
	
	
	
	

}
