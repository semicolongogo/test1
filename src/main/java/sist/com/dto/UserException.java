package sist.com.dto;

public class UserException extends Exception{
	private int port;
	public UserException(String msg) {
		super(msg);
	}
}
