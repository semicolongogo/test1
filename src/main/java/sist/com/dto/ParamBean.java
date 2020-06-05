package sist.com.dto;

public class ParamBean {
	
	private int no;
	private String msg;
	
	
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public ParamBean() {
		super();
	}


	public ParamBean(int no, String msg) {
		super();
		this.no = no;
		this.msg = msg;
	}


	@Override
	public String toString() {
		return "ParamBean [no=" + no + ", msg=" + msg + "]";
	}
	
	

}
