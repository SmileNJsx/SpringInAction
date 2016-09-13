package com.shixiao.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.shixiao.springdemo.Performance;

public class KnightMain
{
	public static void main(String[] args)
	{
//		ClassPathXmlApplicationContext context = 
//				new ClassPathXmlApplicationContext("spring/knight.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Performance performance = context.getBean(Performance.class);
		performance.perform();
//		
//		Knight knight = context.getBean(Knight.class);
//		
//		knight.embarkOnQuest();
//		
		((AbstractApplicationContext) context).close();
	}
}
