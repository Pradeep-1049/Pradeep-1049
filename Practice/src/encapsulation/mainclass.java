package encapsulation;
class account 
{
	private double bal;
	
	public void setbal(double bal)
	{
		if(bal>0)
		{
			this.bal=bal;
		}
		else 
		{
			System.out.println("INVALID TRANSCATION IS FAILED");
		}
	}
	public double getbal()
	{
		return bal;
	}
}
class transaction
{
	public static void deposit(double amt,account ref)
	{
		double 	currbal=ref.getbal();
		double newbal=currbal+amt;
		ref.setbal(newbal);
		
	}
	public static void withdraw(double amt,account ref)
	{
		double 	currbal=ref.getbal();
		double newbal=currbal-amt;
		ref.setbal(newbal);
	}
	public static void showbal(account ref)
	{
		double currbal=ref.getbal();
		System.out.println("Current bal :" +currbal);
	}
}
public class mainclass
{

	public static void main(String[] args) 
	{
    account a1=new account();
    account a2=new account();
    
    transaction.deposit(1111,a2);
    transaction.showbal(a2);
    
   transaction.deposit(2222,a1);
   transaction.showbal(a1);
   transaction.withdraw(552,a1);
   transaction.showbal(a1);



   
   
	

	}

}
