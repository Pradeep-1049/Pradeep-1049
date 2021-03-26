package com.jspiders.springcollection;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context=null;
		
		context=new ClassPathXmlApplicationContext("com/jspiders/springcollection/springconfiq.xml");//copy the fully qualified name of springconfiq.xml path
        Student student =(Student)context.getBean("student");//Call the bean name
        System.out.println(student);
        List<String> subjects= student.getSubjects();
        System.out.println(subjects.getClass());
        if(context!=null)
        { 
        	context.close();
        }
  	
	
	}

}
