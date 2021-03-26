package com.arrays.pkg1;

public class Makelast 
{  
	public static int[] make(int[] nums)
	{
	   int[] a = new int[nums.length*2];
	   a[nums.length*2 - 1] = nums[nums.length-1];
	   printarray(nums);
	   return nums;

	}
   public static void printarray(int[] ref)
   {
	   for(int index=0;index<ref.length-1;index++)

   {
		   System.out.println(ref[index]+" ");
		}
   }
	public static void main(String[] args) 
	{
     int[] arr= {2,3,6};
    make(arr); 
    int[] arr2= {3,4,7};
    make(arr2);
	}

}
