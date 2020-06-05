package sist.com.basic.di2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Society {
	@Resource(name="person2")
	private Person person;
	private Person person2;

	public Person getPerson() {
		return person;
	}
   /* @Required
    @Autowired
    @Qualifier(value="q2")*/
	/*@Required
    @Autowired
	public void setPerson(@Qualifier(value="q1")Person person, @Qualifier(value="q2")Person person2) {
		this.person = person;
		this.person2=person2;
	}*/	
	@Required
	@Resource(name="person1")
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public String toString() {
		return "Society [person=" + person + ", person2=" + person2 + "]";
	}



	

	
	
	
	
	

}
