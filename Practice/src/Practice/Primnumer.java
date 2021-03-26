package Practice;

import java.util.Scanner;

public class Primnumer {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		 int i,m1=0,flag1=0;      
		    int n1= sc.nextInt();

	     //int n1=3;//it is the number to be checked    
	     m1=n1/2;      
	     if(n1==0||n1==1){  
	      System.out.println(n1+" is not prime number");      
	     }else{  
	      for(i=2;i<=m1;i++){      
	       if(n1%i==0){      
	        System.out.println(n1+" is not prime number");      
	        flag1=1;      
	        break;      
	       }      
	      }      
	      if(flag1==0)  { System.out.println(n1+" is prime number"); }  
	     }//end of else  

	 	}

}
