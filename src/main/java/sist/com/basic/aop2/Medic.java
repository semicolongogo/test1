package sist.com.basic.aop2;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class Medic  implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		Marine marine=(Marine)target;
		if(marine.getCommand() instanceof CommandAttack) {
			System.out.println("Ä¡·áÁß..afterReturning");
		}
	}
	
	
	

}
