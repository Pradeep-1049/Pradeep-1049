package com.jspiders.solidprinciples.srp;

public class Mainlass {

	public static void main(String[] args) 
	{
          Employee emp= new Employee(1,"ABC",500000);
          new EmployeeInsert().insert();
          new EmployeeRead().read();
          new EmployeeUpdate().update();
          new EmployeeDelete().delete();
	}

}
