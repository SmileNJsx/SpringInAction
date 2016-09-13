package com.shixiao.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc 
{

	private String title = "Sgt . Pepper's";
	@Override
	public void play()
	{
		// TODO Auto-generated method stub
		System.out.println("Playing " + title);
	}

}
