package com.jspiders.solidprinciples.ocp;

public class VehicleLoanCustomer implements Customer
{

	@Override
	public boolean isCustomerLoyal() {
		return false;
	}

}
