package com.jspiders.datastructure.array;
class Employee
{   private int id;
	private String name;
	private String job;
	private double sal;
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
	public String toString() 
	{
		String empDetails=name+" "+id+" "+sal+" "+job;
		return empDetails;
	}
}
public class Mainclass3
{

	public static void main(String[] args)
	{
     Employee[] elist=new Employee[2];
     elist[0] =new Employee (1,"Pradeep","Developer",103333.44);
     elist[1] = new Employee(2,"prem","sofware",45667.44);
     elist[2] = new Employee(3,"ramesh","dm",98333.44);
     System.out.println( elist[0].toString());


}

}
