package sist.com.basic.di4;

public class AdminSystem extends AdapterSystem implements SystemService {
	
	private  Dao dao;
	private DaoFactory dfactory;

	@Override
	public void startEndCheck() {
		// TODO Auto-generated method stub
		dao.select();
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub	
		
	}
}
