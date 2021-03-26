package com.arrays.pkg1;

public class Start1 {
      /*{   int count=0;
    	  if(a.length!=0)
    	  {
    		  if(a[0]==1)
    			  count++;
    	  }
    	  if(b.length!=0)
    	  {
    		  if(b[0]==1)
    			  count++;
    	  }
    	  return count;*/
    public static int[] start(int[] a,int[] b) 
    {

	if(a[0]+a[1] >b[0]+b[1])
	    {printarray(a);
		return a;
		
		}
		else 
		   {printarray(b);
			return b;
			}
      }
    public static void printarray(int[] ref)
    {
    	for(int i=0;i<ref.length;i++)
    	{
    		System.out.print(ref[i]+" ");
    	}System.out.println(" ");
    }
     
	public static void main(String[] args)
	{
		int[] a1= {1,2};
		int[] b1= {3,4};
		System.out.println(start(a1,b1));
		System.out.println("--------------------------------------------");
		int[] a2= {6,7};
		int[] b2= {4,2};
		System.out.println(start(a2,b2));

	}

}
