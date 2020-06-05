package sist.com.basic.aop1;

public class MyBatisDaoAop  implements Dao{	
	@Override
	public int insertProcess() {
		// TODO Auto-generated method stub
		System.out.println("insertProcess");
		return 0;
	}

	@Override
	public void selectData() {
		// TODO Auto-generated method stub
		System.out.println(" MyBatisDao selectData() ");
		
	}
	@Override
	public void selectData(int a) {
		// TODO Auto-generated method stub
		System.out.println(" MyBatisDao selectData(int a) ");
		
	}

	@Override
	public String updateProcess() {
		// TODO Auto-generated method stub
		System.out.println("updateProcess");
		int i=0;
		int rs=100/i;
		
		return "TestupdateProcess";
	}
	
	

}
