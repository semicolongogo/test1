package sist.com.basic.di3;

public class JDBCDao implements Dao {	
	public void selectUser() {
		System.out.println("JDBCDaoselectUser");
	}
	public void DeleteUser() {
		System.out.println("JDBCDaoDeleteUser");
	}

}
