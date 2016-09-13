package com.shixiao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;

import com.shixiao.springdemo.MagicBean;
import com.shixiao.springdemo.MagicExistCondition;
import com.shixiao.springdemo.Performance;
import com.shixiao.springdemo.SingPerformance;

@ContextConfiguration
@ComponentScan("com.shixiao.springdemo")
@EnableAspectJAutoProxy()


public class Config
{
	@Bean
	@Conditional(MagicExistCondition.class)
	public MagicBean magicBean()
	{
		return new MagicBean();
	}
	
//	@Bean
//	public Audience audience()
//	{
//		return new Audience();
//	}
	
	@Bean
	public Performance performance()
	{
		return new SingPerformance();
	}
}
