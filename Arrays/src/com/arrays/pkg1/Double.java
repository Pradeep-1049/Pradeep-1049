package com.arrays.pkg1;

public class Double
{
    public static int[] make(int[] nums)
    {
    	int[] a=new int[nums.length*2];
    	a[nums.length*2-1]=nums[nums.length-1];
    	printarray(a);
    	return a;
    	
    }
    public static void printarray(int[] ref)
    {
    	for (int i=0; i<ref.length-1;i++)
    	{
     System.out.print(ref[i]);		
    	}
    }
	public static void main(String[] args) 
	{
    int[] a1= {30,20,40};
    System.out.println(make(a1));
	}

}
