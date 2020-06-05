package sist.com.basic.di4;


public class OralceDbms  implements FrameWorkDom{	
	private String url;
	private String account;
	private String pasword;
	
	
	public OralceDbms() {
		super();
	}

	public OralceDbms(String url, String account, String pasword) {
		super();
		this.url = url;
		this.account = account;
		this.pasword = pasword;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println(url+" "+account+"Connect");
	}
	@Override
	public void release() {
		// TODO Auto-generated method stub
		System.out.println(url+" "+account+"Release");
	}
	@Override
	public void parse() {
		// TODO Auto-generated method stub
		System.out.println("OralceDomParse");
	}

	public void processSql() {
	System.out.println("OralceDbmsprocessSql");	
	}

	@Override
	public void selectList() {
		// TODO Auto-generated method stub
		System.out.println("OracleSelectList");
	}

	@Override
	public void selectOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectMap() {
		// TODO Auto-generated method stub
		
	}
	

}
