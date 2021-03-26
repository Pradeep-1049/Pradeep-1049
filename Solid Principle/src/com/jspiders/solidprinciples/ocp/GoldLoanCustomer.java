package com.jspiders.solidprinciples.ocp;

public class GoldLoanCustomer implements Customer
{

	@Override
	public boolean isCustomerLoyal() {
		return false;
	}

}
