package sist.com.basic.aop3;

import org.springframework.stereotype.Component;

@Component
public class FileProcess {
	
	public  void fileValidate() {
		System.out.println("fileValidate");
	}
	public void fileProperties() {	
		System.out.println("fileProperties");
	}

}
