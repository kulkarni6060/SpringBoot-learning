package com.tca.bean;

public class ServiceA 
{
	private ServiceB serviceB;
	/*
	public ServiceA()
	{
		System.out.println("ServiceA : Constructor");
	}
	
	/*
	public ServiceA(ServiceB serviceB)
	{
		this.serviceB = serviceB;
	}
	*/
	
	public void display()
	{
		System.out.println("ServiceA - display()");
		serviceB.show();
	}

	public void setServiceB(ServiceB serviceB)
	{
		this.serviceB = serviceB;
		System.out.println("Injection : A<----B");
	}

}
