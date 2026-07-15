package com.tca.bean;

public class ServiceB 
{
	private ServiceA serviceA;
	
	public ServiceB(ServiceA serviceA)
	{
		this.serviceA = serviceA;
		System.out.println("ServiceB : constructor");
	}
		
	public void show() 
	{
		System.out.println("ServiceB : show()");
		
		
	}

}
