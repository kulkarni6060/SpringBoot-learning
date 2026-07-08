package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.WelcomeBean;

public class App {
    public static void main(String[] args) 
    {
        // step 1 : Creating and Strating Container
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        // Step 2 : Get the object of Bean
        
        Object obj = context.getBean(WelcomeBean.class);
        WelcomeBean wb = (WelcomeBean) obj;

        // Step 3 : Call bean method / Bussiness Logic

           String msg = wb.getMessage();

           System.out.println(msg);	
    }
}