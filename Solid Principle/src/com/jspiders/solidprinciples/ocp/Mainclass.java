package com.jspiders.solidprinciples.ocp;

public class Mainclass {

	public static void main(String[] args)
	{
		Customer customer=new EducationLoanCustomer ();
		double discount=DiscountCalculator.calculate(customer);
		System.out.println(discount);
	}

}
