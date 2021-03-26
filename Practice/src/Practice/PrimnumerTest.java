package Practice;

import java.util.Scanner;

public class PrimnumerTest {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int m=0,flag=0;
		
		int n=sc.nextInt();
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println("It is Not a Prime Number");
		}
		else {
			for (int i=2;i<m ;i++ ) 
			{
			if(n%i==0)
            {
          	System.out.println("It is Not a Prime Number");
          	flag=1;
          	break;
            }
			}
			if(flag==0)
			{
		          System.out.println("It is Prime number");

			}
		}
	 	}

}
