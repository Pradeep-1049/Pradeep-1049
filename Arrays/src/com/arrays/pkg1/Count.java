package com.arrays.pkg1;

public class Count
{
    public static int[] count(int[] a,int[] b)
    {
    	if(a[0]+a[1] > b[0]+b[1])
    		return a;
    	else 
    		return b;
    }
    public static void printarray(int[] ref)
    {
    	for(int i=0; i<ref.length;i++)
    	{
    		System.out.println(ref[i]);
    	}
    }
	public static void main(String[] args)
	{
     int[] arr1= {2,3};
     int[] arr2= {5,4};
     System.out.println(count(arr1,arr2));
     
	}

}
