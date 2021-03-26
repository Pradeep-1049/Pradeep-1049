package com.jspiders.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountry {

	public static void main(String[] args) {
    
		ClassPathXmlApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("com/jspiders/mapcollection/springconfiq.xml");
		Country country=(Country)context.getBean("country");
		System.out.println(country);
		if(context!=null)
		{
			context.close();
		}
	}

}
