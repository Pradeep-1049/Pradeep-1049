package com.jspiders.solidprinciples.dip;

public class DisplayProduct 
{
   public void display()
   {
	Product product = HelperClass.getProduct();
	int numberOfProducts = product.read();
	System.out.println("Products per page : "+numberOfProducts/10);
    }
}
