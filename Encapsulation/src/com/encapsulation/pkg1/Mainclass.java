package com.encapsulation.pkg1;
class Account
{
	private double bal;//data member as private and access using getter and settter method

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	
}
class Transaction
{
	public static void deposit(double amt,Account ref)
	{
		double currBal=ref.getBal();//gettting current balance
		double newBal=currBal+amt;//updating new balance
		ref.setBal(newBal);//return the new balance
	}
	public static void withdraw(double amt,Account ref)
	{
	 double currBal=ref.getBal();
	 double newBal=currBal-amt;
	 ref.setBal(newBal);
	}
	public static void showbal(Account ref)
	{
		double currBal=ref.getBal();
		System.out.println("Current Bal :"+currBal);
	}
}
public class Mainclass {

	public static void main(String[] args)
	{
         Account a1=new Account();
         Transaction.deposit(1233,a1);
         Transaction.showbal(a1);

         Transaction.withdraw(300, a1);
         Transaction.showbal(a1);
         
         Transaction.deposit(77, a1);
         Transaction.showbal(a1);

         
	}

}
