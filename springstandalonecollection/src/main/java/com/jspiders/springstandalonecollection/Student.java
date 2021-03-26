package com.jspiders.springstandalonecollection;

import java.util.List;

public class Student {
     String name;
     int id;
     double marks;
     List<String> subjects;
     
     public void init()
     {
    	 System.out.println("Inside init()-Method");
     } 
     public void destroy()
     {
    	 System.out.println("Inside destroy()-Method");
     }
     
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", subjects=" + subjects + "]";
	}
}
