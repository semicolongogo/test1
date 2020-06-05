package sist.com.basic.di3;

public class ServiceImp implements Service{
	private Dao dao;
	
	
	
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	@Override
	public void findUser() {
		// TODO Auto-generated method stub
		dao.selectUser();	
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	
	}
	
	

}
