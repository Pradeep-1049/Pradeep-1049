package com.jspiders.pakage1;
class Sample{
	private String name;
	private String department;
	private String password;
	private String repassword;
	public Sample(String name, String department, String password, String repassword) {
		super();
		this.name = name;
		this.department = department;
		this.password = password;
		this.repassword = repassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	@Override
	public String toString() {
		return "sample [name=" + name + ", department=" + department + ", password=" + password + ", repassword="
				+ repassword + "]";
	}
 }
public class Mainclass2 {

	public static void main(String[] args) 
	{
         new Sample("Pradeep", "Bio-Medical Engineering", "90809ohfhe0", "90809ohfhe0").toString();
    }

}
