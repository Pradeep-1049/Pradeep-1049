package com.jspiders.string.stringbuffer;

public class Mainclass1
{
   public static String test(String str)
  {
	   String res=" ";
	for(int i=0; i<str.length();i++)
	{
		char c1=str.charAt(i);
		res=res+c1+c1+c1;
	}	
	return res;
	}
   public static void main(String[] args) 
   {
	System.out.println(test("abc"));
}
}
