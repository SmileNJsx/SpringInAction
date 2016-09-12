package com.shixiao.springdemo;

import java.io.PrintStream;

public class Minstrel
{
	private PrintStream stream;
	
	public Minstrel(PrintStream stream)
	{
		this.stream = stream;
	}
	
	public void singBeforeQuest()
	{
		stream.println("Fa la la");
	}
	
	public void singAfterQuest()
	{
		stream.println("Tee haa haa");
	}
}
