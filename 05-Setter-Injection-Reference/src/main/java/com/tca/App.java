package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.Address;
import com.tca.bean.Customer;

public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Customer cust = (Customer) context.getBean("customer");
        
        System.out.println("Customer ID     :"+  cust.getCustomerId());
        System.out.println("Customer Name   :" + cust.getCustomerName());
        System.out.println("Customer City   :" + cust.getAddress().getCity ());
        System.out.println("city Pincode    :" + cust.getAddress().getPincode ());
        
        System.out.println("____________________________________________________");
        
        
        Address address = (Address) context.getBean("addr");
        System.out.println("City       :   " + address.getCity());
        System.out.println("Pincode    :   " + address.getPincode());
        
        
        
    }
}
