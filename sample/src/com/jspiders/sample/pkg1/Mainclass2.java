package com.jspiders.sample.pkg1;

public class Mainclass2 
{
public static void main(String[] args) 
{
	String s1 = new String("hello");
	String s2 = new String("HELLo");
	
	int h1=s1.hashCode();
	System.out.println(h1);
	
	int h2=s2.hashCode();
	System.out.println(h2);
	
	String str1=s1.toString();
	System.out.println(str1);
	
	String str2=s2.toString();
	System.out.println(str2);
	
	boolean b1=s1.equals(s2);
	System.out.println(b1);
	
	
	
	
	
}
}
