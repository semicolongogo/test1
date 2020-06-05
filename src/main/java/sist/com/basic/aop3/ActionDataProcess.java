package sist.com.basic.aop3;

import org.springframework.stereotype.Component;

@Component
public class ActionDataProcess implements Search {
	
	@Override
	public void fileSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xmlParsing() {
		// TODO Auto-generated method stub
	System.out.println("ActionxmlParsing");	
	 String str=null;
	 str.charAt(0);
	}

	@Override
	public void domSaxPasing() {
		// TODO Auto-generated method stub
		
	}

	public void process() {
		System.out.println("ActionDataProcess");
	}

}
