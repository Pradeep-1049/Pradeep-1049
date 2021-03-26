package com.jspiders.springconstructorinjection;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Subject implements InitializingBean,DisposableBean {
 private int id;
 private String name;
 private double marks;
public Subject(int id, String name, double marks) {
	super();
	this.id = id;
	this.name = name; 
	this.marks = marks;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Subject [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}
@Override
public void afterPropertiesSet() throws Exception {
    System.out.println("Inside afterPropertiesSet-Method ");	
}
@Override
public void destroy() throws Exception {
System.out.println("Inside destroy-Method ");	
}
}
