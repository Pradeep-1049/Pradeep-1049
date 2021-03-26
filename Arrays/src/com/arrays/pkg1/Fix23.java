package com.arrays.pkg1;

public class Fix23
{
   public static int[] fix(int[] nums)
   {
	   int[]  arr= {nums[0],nums[1],nums[2]};
	  //int[] arr=new int[size] ;
	   if(nums[0]==2 && nums[1]==3)
		   arr[1]=0;
	   if(nums[1]==2 && nums[2]==3)
		   arr[2]=0;
	   printarray(arr);
	   return arr;
	
}
   public static void printarray(int[] ref)
   {
	   for(int index=0; index<ref.length-1; index++)
	   {
		   System.out.println(ref[index]);
	   }
   }
   public static void main(String[] args)
	{
    int[] a= {7,2,3};
    fix(a);
	}

}
