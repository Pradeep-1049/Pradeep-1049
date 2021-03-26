package com.jspiders.springautowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
  private int empno;
  private String empname;
  private double salary;
  
  
  private Address address;
  
public Employee(int empno, String empname, double salary, Address address) {
	super();
	this.empno = empno;
	this.empname = empname;
	this.salary = salary;
	this.address = address;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Address getAddress() {
	return address;
}
@Autowired
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [empno=" + empno + ", empname=" + empname + ", salary=" + salary + ", address=" + address + "]";
}
}
