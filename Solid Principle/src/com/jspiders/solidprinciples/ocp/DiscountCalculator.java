package com.jspiders.solidprinciples.ocp;

public class DiscountCalculator 
{
	static double discount=20.0;

    public static double calculate(Customer customer)
    {

	if(customer.isCustomerLoyal())
	{
		discount=discount*1.5;
		
	}
	return discount;
    }
}
