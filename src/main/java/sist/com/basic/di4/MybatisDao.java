package sist.com.basic.di4;

public class MybatisDao implements Dao{
	private  FrameWorkDom dom;
	@Override
	public void select() {
		// TODO Auto-generated method stub
		dom.connect();
		dom.selectList();
		dom.release();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MybatisDaoUpdate");
	}
	

}
