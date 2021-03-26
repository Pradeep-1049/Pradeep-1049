package com.jspiders.springannotation;

import javax.swing.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSudent {

	public static void main(String[] args) {
      AnnotationConfigApplicationContext context=null;
      context=new AnnotationConfigApplicationContext(Spring.class);
        Student student=context.getBean(Student.class);
        StudentDAOImpl students=context.getBean(StudentDAOImpl.class);
       int res= students.create(student);
      System.out.println("Resulted data :"+res); 
      
      if(context!=null)
      {
    	  context.close();
      }
	}

}
