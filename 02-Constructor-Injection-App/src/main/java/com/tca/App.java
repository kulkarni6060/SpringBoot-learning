package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.ConstructorBean;

public class App 
{
    public static void main(String[] args)
    {
    	//Step 1: Creating and Starting container
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        ConstructorBean wb = (ConstructorBean) context.getBean("ConstructorBean");
        int id =wb.getId();
        String msg = wb.getMessage();
        
        System.out.println(id);
        System.out.println(msg);
        
   }
}
