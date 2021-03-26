package object;

public class arrrayindexexeption 
{
public static  void test(int n)
{
	System.out.println("test() starts");

int[] a1 = {10,20,30};
try {
System.out.println("array element :"+a1[n]);
}
catch(ArrayIndexOutOfBoundsException ae)
{
	System.out.println("INVALID INDEX");
}
System.out.println("test() ends");

}
	public static void main(String[] args)
	{
		System.out.println("main starts");
    test(4);
	System.out.println(" main ends");

	}

}
