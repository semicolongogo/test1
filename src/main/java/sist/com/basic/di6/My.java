package sist.com.basic.di6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class My {
	@Resource(name="com")
	private Computer computer;
	public My() {
		System.out.println("MyConstructor");
	}
	public My(Computer computer) {		
		this.computer = computer;
	}
	@PostConstruct
	public void initProcess() {
		System.out.println("initProcess");
	}
	@PreDestroy
	public void destoryProcess(){
		System.out.println("destoryProcess");
	}
	public Computer getComputer() {
		return computer;
	}
	@Required
	@Autowired
	@Qualifier(value="com1")
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	@Override
	public String toString() {
		return "My [computer=" + computer + "]";
	}
	
	

}
