package sist.com.basic.aop1;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimeAdvice {	//Advice[what,when]   --> Advice=�����
							//when = around,before,after,afterreturning,throwing
	
	public void timeCheck(ProceedingJoinPoint joinPoint)throws Throwable{	//Throwable == exception�� ����
								/*JoinPoint==before*/
		
		joinPoint.proceed(); //�ٽ��ڵ� ȣ��
		//before�� �� �� �ְ� after�� �� �� �ִ�  ==> around
		
		long start=System.currentTimeMillis();
	
		
		
		//�ٽ��ڵ� call
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
	
		long end=System.currentTimeMillis();
//		System.out.println((end-start)+"�и��� �ҿ�");
		System.out.println(((int)(Math.random()*100)%90)+"�� �ҿ�");
		
		
	}
 
}
