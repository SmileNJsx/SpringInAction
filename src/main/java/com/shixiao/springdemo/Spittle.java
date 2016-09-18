package com.shixiao.springdemo;

import java.util.Date;

public class Spittle
{
	private final Long id;
	private final String message;
	private final Date time;
	private Double latitude;
	private Double longitude;
	
	public Spittle(String message , Date time)
	{
		this(message , time , null , null);
	}

	public Spittle(String message, Date time, Double latitude , Double longitude)
	{
		// TODO Auto-generated constructor stub
		this.id = null;
		this.message = message;
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getId()
	{
		return id;
	}

	public String getMessage()
	{
		return message;
	}

	public Date getTime()
	{
		return time;
	}

	public Double getLatitude()
	{
		return latitude;
	}

	public Double getLongitude()
	{
		return longitude;
	}
}
