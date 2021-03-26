package com.jspiders.mapcollection.database;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {

	public static void main(String[] args) {
    
		ClassPathXmlApplicationContext context=null;
		
		context=new  ClassPathXmlApplicationContext("com/jspiders/mapcollection/database/springconfiq.xml");
	  Database database =(Database) context.getBean("database");
	  System.out.println(database);
	  if(context!=null)
	  {
		  context.close();
	  }
	}

}
