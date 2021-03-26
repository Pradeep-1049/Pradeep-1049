package com.jspiders.springautowired.stereo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context=null;
    context=new ClassPathXmlApplicationContext("com/jspiders/springautowired/stereo/springconfiq.xml");
   Company company=(Company) context.getBean("company");
   System.out.println(company);
       if (context != null) 
       {
	     context.close();
       }
   }
}
//pascal => MyFirstProgram ............class,interface
//camel  =>myFirstProgram..............reference var