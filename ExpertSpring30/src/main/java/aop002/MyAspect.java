package aop002;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* runSomething())")
//	@After("execution(public void aop002.Boy.runSomething())")
	public void before(JoinPoint JoinPoint) {
		System.out.println("얼굴 인식 확인 : 문을 개방하라");
		//System.out.println("열쇠로 문을 열고 들어간다.");
	}

}
