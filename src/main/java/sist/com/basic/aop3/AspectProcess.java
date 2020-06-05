package sist.com.basic.aop3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectProcess {	
	
	/*@Before("execution(public * sist.com.basic.aop3.Search*.*())")
	public void dataAttributeSearch(JoinPoint joinPoint) {
		System.out.println("BeforeDataProcess");
		Signature signature=joinPoint.getSignature();
		System.out.println("Name:"+signature.getName());
		if(signature.getName().equals("fileSearch")) {
			System.out.println("FileSearchBeforeProcess");
		}else if(signature.getName().equals("domSaxPasing")) {
			System.out.println("domSaxPasingBeforeProcess");
		
	    }else if(signature.getName().equals("xmlParsing")) {
	    	System.out.println("xmlParsingBeforeProcess");
	    }
	}//method
*/	
	/*@After("execution(public * sist.com.basic.aop3.Search*.*())")
	public void afterProcess() {
		System.out.println("afterProcess");		
	}
	@AfterReturning("execution(public * sist.com.basic.aop3.Search*.*())")
	public void afterReturningProcess() {
		System.out.println("afterReturningProcess");		
	}
	@AfterThrowing("execution(public * sist.com.basic.aop3.Search*.*())")
	public void afterThrowingProcess() {
		System.out.println("afterThrowingProcess");
	}	*/
	
	
	@Around("execution(public * sist.com.basic.aop3.Search*.*())")
	public void aroundProcess(ProceedingJoinPoint jp) {
		System.out.println("Java °øÅë´Ü");
		try {
			jp.proceed();			
		} catch (Throwable e) {
			// TODO: handle exception
		}
	}
	
	
	
	

}















