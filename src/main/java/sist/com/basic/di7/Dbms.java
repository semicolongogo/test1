package sist.com.basic.di7;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Dbms {
	@Value("${db.dbdriver}")
	private String dbDriver;
	@Value("${db.url}")
	private String url;
	@Value("${db.userName}")
	private String userName;
	@Value("${db.userpass}")
	private String userpass;
	public String getDbDriver() {
		return dbDriver;
	}
	public void setDbDriver(String dbDriver) {
		this.dbDriver = dbDriver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	@Override
	public String toString() {
		return "Dbms [dbDriver=" + dbDriver + ", url=" + url + ", userName=" + userName + ", userpass=" + userpass
				+ "]";
	}
	
	
	
	
	

}
