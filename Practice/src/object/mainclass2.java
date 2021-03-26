package object;
class Demo extends Object
{
	@Override
	public int hashCode()
	{
		return 292;
	}

	@Override
	public String toString() 
	{
		String ref="ovverridden toString() method";
		return ref;
	}
}


public class mainclass2
{
   public static void main(String[] args)
	{
     Demo d1=new Demo();
     Demo d2=new Demo();

     int h1=d1.hashCode();
     System.out.println(h1);
     
     boolean b1=d1.equals(d2);
     System.out.println(b1);
 }

}
