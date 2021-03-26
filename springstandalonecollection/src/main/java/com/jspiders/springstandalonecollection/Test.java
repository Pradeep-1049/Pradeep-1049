package com.jspiders.springstandalonecollection;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=null;
	
		context=new ClassPathXmlApplicationContext("com/jspiders/springstandalonecollection/springconfiq.xml");
		Student student=(Student)context.getBean("student");
		System.out.println(student);
		
		List<String> subjects=student.getSubjects();
       System.out.println(subjects.getClass());
       
		if(context!=null)
		{
			context.close();
		}
	}

}
