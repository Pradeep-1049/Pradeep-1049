package com.jsp.threads;

public class Mainclass3 
{ 
	static String str=new String("Hello");
   public static void main(String[] args) 
   {
	    Runnable r1=()->
	    {  
	    	synchronized (str)
		    {
		    str=str.concat("WOrld");
		    System.out.println(str);
	       }
	    };
	    Runnable r2=()->
	   { 
		   synchronized (str)
		   {
		   str=str.concat("Java");
		   System.out.println(str);
	       }
	   };
	Thread th1=new Thread(r1);
	Thread th2=new Thread(r2);
	th1.start();
	th2.start();

   }
}
