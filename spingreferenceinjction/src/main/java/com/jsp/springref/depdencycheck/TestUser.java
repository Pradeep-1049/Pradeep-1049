package com.jsp.springref.depdencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=null;
     context= new ClassPathXmlApplicationContext("com/jsp/springref/depdencycheck/springconfiq.xml");
    User user1=(User) context.getBean("user");
    User user2=(User) context.getBean("user");
     System.out.println(user1);
     System.out.println(user1);

    System.out.println(user1.hashCode());
    System.out.println(user2.hashCode());

    if(context!=null)
    {
    	context.close();
    }
	}

}
