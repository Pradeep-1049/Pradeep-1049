package com.jspiders.springinterfaceinjection;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=null;
     context=new ClassPathXmlApplicationContext("com/jspiders/springinterfaceinjection/springconfiq.xml");            
     Customer customer=(Customer)context.getBean("customer");
     System.out.println(customer);
     if(context!=null)
     {
    	 context.close();
     }

	}
}
