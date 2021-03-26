package com.jspiders.springmysql;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
    ClassPathXmlApplicationContext context=null;
    context=new ClassPathXmlApplicationContext("com/jspiders/springmysql/springconfiq.xml");
    Student student=(Student)context.getBean("student");
		StudentDAOimpl studentdaoimpl=(StudentDAOimpl)context.getBean("studentDAOimpl");
	
		int res=studentdaoimpl.create(student);
		System.out.println("Record is updated :"+res);
		
		if(context!=null)
		{
			context.close();
		}
	}

}
