package com.jspiders.springconstructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=null;
	
		context=new ClassPathXmlApplicationContext("com/jspiders/springconstructorinjection/springconfiq.xml");
       Subject student =(Subject)context.getBean("student");
       System.out.println(student);
       if(context!=null)
       {
    	   context.close();
       }
	}

}
