package com.jspiders.pakage1;

import java.util.Iterator;

public class Mainclass4 {

	public static void main(String[] args) {
	   
		int yr=1991;
		boolean leap=false;
		
		if(yr%4==0)
		{
			if(yr%100==0)
			{
				if(yr%400==0)
					leap=true;
				else leap=false;
			}
			else leap=true;
		}
		else leap=false;
		
		if(leap)
		
			System.out.println("It is a leap year");
		else 
			System.out.println("It is not leap year");
		
	
	}
}
