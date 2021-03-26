package com.jspiders.spingreferenceinjction;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestPerson {

    public static void main(String[] args) {
			ClassPathXmlApplicationContext context=null;
			
	      context=new  ClassPathXmlApplicationContext("com/jspiders/spingreferenceinjction/springconfiq.xml");
	      Person person1=(Person)context.getBean("Person");
	      Person person2=(Person)context.getBean("Person");
          
	      System.out.println(person1);
	      System.out.println(person2);

	      System.out.println(person1.hashCode());
	      System.out.println(person2.hashCode());

	      if(context!=null)
	      {
	    	  context.close();
	      }
	      

		}

}
