package sist.com.basic.di8;

import org.springframework.stereotype.Component;
@Component
public class Action {
	private String when;
	private String where;
	private String what;	
	public Action() {
		super();
	}
	public Action(String when, String where, String what) {
		super();
		this.when = when;
		this.where = where;
		this.what = what;
	}
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public String getWhat() {
		return what;
	}
	public void setWhat(String what) {
		this.what = what;
	}
	public void method(String data) {
		this.what=data;
	}
	
	
	

}
