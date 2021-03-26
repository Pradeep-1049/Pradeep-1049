package com.jspiders.datastructure.pkg2;

import java.util.Arrays;

//Bean
class Employee
{
	int id;
	String name;
	String job;
	double sal;
	public Employee(int id, String name, String job, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		String empdetails=name+" "+id+" "+sal+" "+job;
		return empdetails;
	};	
}
class EmployeeService
{
	public  static void displayAllEmp(Employee[] elist)
	{
		for(int i=0;i<elist.length;i++)
		{   if(elist[i].getSal()>1500)
	    	{
			System.out.println(elist[i].toString());
		    }
		}
	}
	public static void employeeSameName(Employee[] elist)
	{
		for(int i=0;i<elist.length;i++)
		{ 
			for(int j=i+1;j<elist.length;j++)
			{
				if(elist[i].getName().equals(elist[j].getName()))
				{
					System.out.println(elist[i].toString());
				}
			}
		}
	}
	public  static void displayAllEmpStream(Employee[] elist)
	{   
		Arrays.stream(elist)
		        .filter(str -> str.getSal()>1500)
		        .forEach(str -> System.out.println(str.toString()));	        
	}
	public static void employeeSameNameStream(Employee[] elist)
	{
		Arrays.stream(elist)
		.filter(str-> str.getName().equalsIgnoreCase("blake"))
        .forEach(str -> System.out.println(str.toString()));
	}
}
public class Assignment {

	public static void main(String[] args) {
   Employee[] elist=new Employee[5];
   
   elist[0] = new Employee(1,"Smith","Dev",2341.2);
   elist[1] = new Employee(2,"Blake","Sales",1212.1);
   elist[2] = new Employee(3,"Martin","QA",1000);
   elist[3] = new Employee(4,"Miller","DEV",2114.1);
   elist[4] = new Employee(5,"Blake","HR",1311.1);
  
    EmployeeService.displayAllEmp(elist);
    System.out.println("------------------------------------");
    EmployeeService.displayAllEmpStream(elist);
    System.out.println("------------------------------------");
    EmployeeService.employeeSameName(elist);
    System.out.println("------------------------------------");
    EmployeeService.employeeSameNameStream(elist);

	}

}
