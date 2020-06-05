package sist.com.basic.aop1;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimeAdvice {	//Advice[what,when]   --> Advice=공통단
							//when = around,before,after,afterreturning,throwing
	
	public void timeCheck(ProceedingJoinPoint joinPoint)throws Throwable{	//Throwable == exception의 선조
								/*JoinPoint==before*/
		
		joinPoint.proceed(); //핵심코드 호출
		//before도 될 수 있고 after도 될 수 있다  ==> around
		
		long start=System.currentTimeMillis();
	
		
		
		//핵심코드 call
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
	
		long end=System.currentTimeMillis();
//		System.out.println((end-start)+"밀리초 소요");
		System.out.println(((int)(Math.random()*100)%90)+"초 소요");
		
		
	}
 
}
