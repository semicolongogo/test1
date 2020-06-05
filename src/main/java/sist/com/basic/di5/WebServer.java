package sist.com.basic.di5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="web")
public class WebServer {
	@Value("211.63.89.99")
	private String url;
	@Value("oracleDbms")
	private String dbms;
	@Value("50")
	private int conntCount;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDbms() {
		return dbms;
	}
	public void setDbms(String dbms) {
		this.dbms = dbms;
	}
	public int getConntCount() {
		return conntCount;
	}
	public void setConntCount(int conntCount) {
		this.conntCount = conntCount;
	}
	@Override
	public String toString() {
		return "WebServer [url=" + url + ", dbms=" + dbms + ", conntCount=" + conntCount + "]";
	}
	
	

}
