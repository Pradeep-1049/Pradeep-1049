package vector;

import java.util.Vector;

import bean.Employee;

public class Mainclass
{ static Vector<Employee> elist;

          public static void createVectData()
          {
          elist =new Vector<Employee> ();
	
	    Employee e1  = new Employee(1, "Smith", "Dev", 2341.2);
		Employee e2 = new Employee(2, "Blake", "Sales", 1212.1);
		Employee e3 = new Employee(2, "Blake", "Sales", 1212.1);
		Employee e4 = new Employee(3, "Martin", "QA", 1000);
		Employee e5 = new Employee(3, "Martin", "QA", 1000);
		Employee e6 = new Employee(4, "Miller", "DEV", 2114.1);
		Employee e7 = new Employee(5, "Blake", "HR", 1311.1);

	   
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		elist.add(e6);	
		elist.add(e7);

          }
          public static void getVectEmployee()
          {
        	  elist.stream()
        	       .filter(emp->emp!=null)
        	       .forEach(emp->System.out.println(emp));

          }

		public static void main(String[] args)
	   {
			createVectData();
			getVectEmployee();	
	    
	   
        }
}
