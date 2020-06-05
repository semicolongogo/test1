package sist.com.basic.di4;

public class JdbcDao implements Dao {
	private  FrameWorkDom dom;
	public void select() {
		dom.connect();		
		dom.selectList();
		dom.release();
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("jdbcUpdate");
		
	}
	
	

}
