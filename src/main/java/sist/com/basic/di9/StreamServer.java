package sist.com.basic.di9;




public class StreamServer {
	
	private String serverName;
	private int count;
	private String url;
	
	
	
	public StreamServer() {
		super();
	}



	public StreamServer(String serverName, int count, String url) {
		super();
		this.serverName = serverName;
		this.count = count;
		this.url = url;
	}



	public String getServerName() {
		return serverName;
	}



	public void setServerName(String serverName) {
		this.serverName = serverName;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	@Override
	public String toString() {
		return "StreamServer [serverName=" + serverName + ", count=" + count + ", url=" + url + "]";
	}
	
	

	

}
