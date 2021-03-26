package object;

public class exception
{
   public static void test(int n)
    {
	   System.out.println("test() start ");
	try {
	   int  res =50/n;
	System.out.println("res :"+res);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("INVALID NUM FOR DIVISION");
	}
	  System.out.println("test() ends");
    }
	public static void main(String[] args)
	{
     System.out.println("start mainclass");
     test(2);
     System.out.println("ends mainclass");
    }
}
