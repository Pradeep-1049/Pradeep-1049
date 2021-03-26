package com.jspiders.springautowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=null;
    context=new ClassPathXmlApplicationContext("com/jspiders/springautowiring/springconfiq.xml");
   Employee emp=(Employee)context.getBean("employee") ;
   System.out.println(emp);
   if (context != null) 
   {
	context.close();
	
    }
   
	}

}
