package com.jspiders.datastructure.array;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class Mainclass2 
{  
	public static void printTeams(String[] teams)
	{
		Stream<String> stm = Arrays.stream(teams);//Create a stream and return address
	//	Arrays.stream(teams)  .forEach(str-> System.out.print(" "+str));
		//Consumer<String> ref=(String str -> system.out.println(str) );
	}
	public static void printTeamName()
	{
		
	}
	public static void searchTeam()
	{
		
	}

	public static void main(String[] args) 
	{
      String[] teams=new String[10];
      teams[0]="RCB";
      teams[1]="KKR";
      teams[2]="MI";
      teams[3]="CSK";
      teams[4]="RR";

      printTeams(teams);

	}

}
