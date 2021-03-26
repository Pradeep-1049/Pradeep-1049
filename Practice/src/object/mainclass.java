package object;
//Bean
class contact 
{
	int id;
	String name;
	long mob;
	String email;
	public contact(int id, String name, long mob, String email)
	{
		this.id = id;
		this.name = name;
		this.mob = mob;
		this.email = email;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public long getmob() {
		return mob;
	}
	public void setmob(long mob) {
		this.mob = mob;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	@Override
	public String toString() 
	{
		String ref= name +" "+mob;
		return ref;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
     if(obj.hashCode()==this.hashCode())
     {
    	 return true;
     }
     else {
    	 return false;
     }
	}
}
//service
class contactservice
{ 
	private static int id=1;
	static contact storedcontact;
	public static void addcontact( String name, long mob, String email)
	{  
		
		storedcontact=new contact (id,name,mob, email);
		 id++;
		 System.out.println("Contact Added");
	}
	public static void getcontact(String givenname)
	{
		if(givenname.equalsIgnoreCase(storedcontact.getname()))
		{
			System.out.println(storedcontact.toString());
		}
		else
		{
			System.out.println("No Contact");
		}
	}
	public static void addfullcontact(String givenname)
	{
		if(givenname.equalsIgnoreCase(storedcontact.getname()))
		{
			System.out.println(storedcontact.getname());
			System.out.println(storedcontact.getmob());
			System.out.println(storedcontact.getemail());
		}
		else
		{
			System.out.println("No Contact");
		}
	}
	
}

public class mainclass 
{

	public static void main(String[] args) 
	{
contactservice.addcontact("Pradeep", 7904340694l, "pradeepguna1049@gmail.com");
contactservice.getcontact("pradeep");
contactservice.addfullcontact("Pradeep");
	}

}
