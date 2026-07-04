package com.tca.bean;

public class ConstructorBean 
{
	private int id;
	private String message;
	
	public ConstructorBean(int id, String message)
	{
		this.id =id;
		this.message = message;
	}
	public String getMessage()
	{
		return message;
	}
	public int getId()
	{
		return id;
	}

}
