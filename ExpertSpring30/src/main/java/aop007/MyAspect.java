package aop007;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* runSomething())")
	public void before(JoinPoint JoinPoint) {
		System.out.println("얼굴 인식 확인 : 문을 개방하라");
		//System.out.println("열쇠로 문을 열고 들어간다.");
	}
	
	@After("execution(* runSomething())")
	public void lockDoor(JoinPoint JoinPoint) {
		System.out.println("주인님 나갔다: 어이 문 잠거");
	}
	
	@AfterReturning("execution(* runSomething())")
	public void afterReturning(JoinPoint JoinPoint) {
		System.out.println("afterReturning");
	}
	
	@AfterThrowing("execution(* runSomething())")
	public void afterThrowing(JoinPoint JoinPoint) {
		System.out.println("@AfterThrowing");
	}
	
	@Around("execution(* runSomething())")
	public void around(JoinPoint JoinPoint) {
		System.out.println("컴퓨터 자리를 대신하니?");
	}

}
