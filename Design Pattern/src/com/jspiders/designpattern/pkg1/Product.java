package com.jspiders.designpattern.pkg1;

public class Product 
{ 
	private static Product product=null;
	
    String name="Smart Watch";
    double price=2992.33;
    
    private Product()
   {
	 System.out.println("Object is created");
    }
    
    public static Product getInstance()
     {
	 if(product==null)
	 {
		 product=new Product();
	 }
     
     return product;}
}
