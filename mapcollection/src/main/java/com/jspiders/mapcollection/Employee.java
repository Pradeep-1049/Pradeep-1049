package com.jspiders.mapcollection;

import java.util.Set;

public class Employee {
     private int no;
     private  String name;
     private double sal;
     private Set<Long>contact;
     
	public Set<Long> getContact() {
		return contact;
	}
	public void setContact(Set<Long> contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", sal=" + sal + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}
