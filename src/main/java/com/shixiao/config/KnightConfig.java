package com.shixiao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shixiao.springdemo.BraveKnight;
import com.shixiao.springdemo.Knight;
import com.shixiao.springdemo.Quest;
import com.shixiao.springdemo.SlayDragonQuest;

@Configuration
public class KnightConfig
{
	@Bean
	public Knight knight()
	{
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest()
	{
		return new SlayDragonQuest(System.out);
	}
}
