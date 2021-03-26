package com.jspiders.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("com/jspiders/springcore/springconfiq.xml");
		//Object of XML based confiq is created
		Object obj=context.getBean("Student");
		//(or)Student student=(Student)contect.getBean("Student");
		Student student=(Student)obj;
		//
		System.out.println(student);
		  if(context!=null)
		  {
			 context.close(); 
		  }
		
		
		
		
		
	}

}
