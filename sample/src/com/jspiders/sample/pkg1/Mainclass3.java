package com.jspiders.sample.pkg1;

public class Mainclass3
{
  
     /*System.out.println("hello dabba "+ "good afternoon");
     System.out.println("50+10");
     System.out.println(50+10);
     System.out.println(50+10 +"hello dabba" +50+10);
     System.out.println();*/
	   /*int[] arr= {2,5,1,5,8};
	   int temp=0;
	   for(int i=0; i<nums.length; i++)
	   {
		   temp=arr[i];
		   arr[i]=temp;
		   
		   
	   }*/
		   public static int[] rotate(int[] nums)
		   {
		     int temp;
		     for (int i = 0; i < nums.length-1; i++) 
		     {  
		       for (int j = 0; j < nums.length; j++)
		       {
		         temp    = nums[i];
		         nums[i] =nums[j];
		         nums[j] = temp;
		         printstring(nums);
		         return nums;
		       }
		     }
			return nums;
		   }
		   public static void printstring(int[] nums)
		   {
			   for(int k=0; k<nums.length;k++)
			   {
				   System.out.println(k(nums));
			   }
		   }
		   private static char[] k(int[] nums) {
			// TODO Auto-generated method stub
			return null;
		}
		public static void main(String[] args)
			{
			   int[] a1= {4,4,2,8,28,29};
			   System.out.println(a1);
		    }

}
