package com.shixiao.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shixiao.springdemo.Knight;

public class KnightMain
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/knight.xml");
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		
		Knight knight = context.getBean(Knight.class);
		
		knight.embarkOnQuest();
		
		context.close();
	}
}
