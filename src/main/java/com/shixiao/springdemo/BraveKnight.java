package com.shixiao.springdemo;

public class BraveKnight implements Knight
{
	private Quest quest;
	
	public BraveKnight(Quest quest)
	{
		this.quest = quest;
	}
	
	@Override
	public void embarkOnQuest()
	{
		// TODO Auto-generated method stub
		quest.embark();
	}

}
