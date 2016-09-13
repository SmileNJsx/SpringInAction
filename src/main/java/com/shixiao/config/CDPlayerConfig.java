package com.shixiao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shixiao.springdemo.CDPlayer;
import com.shixiao.springdemo.CompactDisc;
import com.shixiao.springdemo.SgtPeppers;

@Configuration
//@ComponentScan("com.shixiao.springdemo")
public class CDPlayerConfig
{
	@Bean(name="anothername")
	public CompactDisc sgtPeppers()
	{
		return new SgtPeppers();
	}
	
//	@Bean
//	public CDPlayer cdPlayer()
//	{
//		return new CDPlayer(sgtPeppers());
//	}
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc)
	{
		return new CDPlayer(compactDisc);
	}
	
//	@Bean
//	public CDPlayer cdPlayer(CompactDisc cd)
//	{
//		return new CDPlayer.set(cd);
//	}   set方法传入
	
}
