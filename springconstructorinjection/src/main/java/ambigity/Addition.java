package ambigity;

public class Addition {
	public Addition(double n1,double n2)
    {
 	   System.out.println("Double Result :"+(n1+n2));
    }
       public Addition(int n1,int n2)
       {
    	   System.out.println("Integer Result :"+(n1+n2));
       }
       public Addition(String n1,String n2)
       {
    	   System.out.println("String Result :"+(n1+n2));
       }
       
}
