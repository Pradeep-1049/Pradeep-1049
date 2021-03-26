package com.jspiders.datastructure.array;


public class Mainclass 
{
	public static void printTeams(String[] teams)
	{ for(int i=0;i<teams.length;i++)
	{  if(teams[i]!=null)
	  {
		System.out.println(teams[i]);
	  }
	}
	}
	public static void printTeamName(String[] teams,int index)
	{   
     
	}
public static void main(String[] args) 
	{ 
	String[] teams=new String[10];
	teams[0]="RCB";
	teams[1]="KKR";
	teams[2]="KXIP";
	teams[3]="DI";
	teams[4]="CSK";
	teams[5]="GL";
	teams[6]="RR";
	printTeams(teams);
	System.out.println(teams);
	

	}

}
