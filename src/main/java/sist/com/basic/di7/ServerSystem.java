package sist.com.basic.di7;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
/*ServerSystem serverSystem=new ServerSystem();*/
@Component
public class ServerSystem {
	
	private Dbms dbms;

	  
	public ServerSystem() {
		System.out.println("ServerSystem");
	}

	public Dbms getDbms() {
		return dbms;
	}
    @Required
    @Resource(name="dbms") 
	public void setDbms(Dbms dbms) {
		this.dbms = dbms;
	}

	@Override
	public String toString() {
		return "ServerSystem [dbms=" + dbms + "]";
	}
	
	
	

}
