package com.jspiders.pakage1;

import java.util.Iterator;

public class Mainclass3 {

	public static void main(String[] args) {
		int count = 0, num = 12226;

	   while(num!=0)
	   {
		   num/=10;
		   count++;
	   }

	    System.out.println("Number of digits: " + count);
	  
	}

	

}
