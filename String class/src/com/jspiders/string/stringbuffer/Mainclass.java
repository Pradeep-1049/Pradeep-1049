package com.jspiders.string.stringbuffer;

public class Mainclass {

	public static void main(String[] args) 
	{
     String str1=new String("hello");
     String str2=new String("hello");

     System.out.println(str1.hashCode()); 
     System.out.println(str2.hashCode());

     StringBuffer sb1=new StringBuffer("hello");
     StringBuffer sb2=new StringBuffer("hello");

     System.out.println(sb1.hashCode());
     System.out.println(sb2.hashCode());
     
     System.out.println(str1.toString());
     
     System.out.println(sb1.equals(str2));


	}

}
