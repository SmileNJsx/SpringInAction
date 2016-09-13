package com.shixiao.springdemo;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience
{
	@Pointcut("execution(* *.perform(..))")
	public void performance()
	{}
	
//	@Before("execution(* com.shixiao.springdemo.Performance.perform(..))")
//	public void silenceCellPhones()
//	{
//		System.out.println("Silencing cell phones");
//	}
	
//	@Before("execution(* *.perform(..))")
//	public void takeSeats()
//	{
//		System.out.println("Taking seats");
//	}
	
	@AfterReturning("performance()") //错误演示
	public void applause()
	{
		System.out.println("Clap Clap Clap!!!");
	}
	
//	@AfterThrowing("execution(* *.perform(..))")
//	public void demandRefund()
//	{
//		System.out.println("demanding a refund");
//	}
	
}
