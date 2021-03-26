package Sample;

import java.util.HashMap;

class Employee 
{
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		String emp=id+" "+name+" "+sal;
		return emp;
	}
	
}
class empService
{   public static void getData(Employee emp)
	{
	HashMap<Integer, String> eMap=new HashMap<Integer, String>();
	eMap.put(1, "Pardeep");
	eMap.put(2, "Prem");
	eMap.put(3, "Ramesh");
	System.out.println(eMap.get(6));
	}
}
public class Mainclass 
{
   public static void main(String[] args)
   { 
	   }
}
