package com.jspiders.solidprinciples.ocp;

public class HomeLoanCustomer implements Customer 
{

	@Override
	public boolean isCustomerLoyal()
	{
		return false;
	}

}
