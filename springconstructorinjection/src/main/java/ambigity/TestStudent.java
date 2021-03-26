package ambigity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=null;
	
		context=new ClassPathXmlApplicationContext("ambigity/springconfiq.xml");
       Addition add =(Addition)context.getBean("addition");
       if(context!=null)
       {
    	   context.close();
       }
	}

}
