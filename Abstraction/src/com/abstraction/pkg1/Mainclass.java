package com.abstraction.pkg1;
interface User//interfase class
{
	public void transfer();
}
class WebUser implements User//implementation class web
{   
	public void transfer() 
	{
		System.out.println("Transfer done in WebUser");
	}
}
class ATMUser implements User//implementation class of ATM
{
	public void transfer() 
	{
		System.out.println("Transfer done in ATMUser");	
	}
}
class Spring
{
	public User CreateUserObj(int usercode)
	{
		User ref;
		if(usercode==123)
		{
			ref=new WebUser();
			System.out.println("Object created in Web User");
			return ref;
		}
		else 
		{
			ref=new ATMUser();
			System.out.println("Object created in ATMUser");
			return ref;
		}
	}
}
public class Mainclass
{
public static void main(String[] args) 
    {
     Spring sp1=new Spring();
     User ref1=sp1.CreateUserObj(123);
     ref1.transfer();
     
     User ref2=sp1.CreateUserObj(234);
     ref2.transfer();
	}

}
