package com.jspiders.springautowired.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company 
{
	@Value("2093u")
 private String companycode;
	
	@Value("IBM")
 private String companyname;
	
	@Value("933")
 private int numberofemp;
	
	@Value("#{names}")
	private List<String> departmentnames;

public String getCompanycode() {
	return companycode;
}
public void setCompanycode(String companycode) {
	this.companycode = companycode;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public int getNumberofemp() {
	return numberofemp;
}
public void setNumberofemp(int numberofemp) {
	this.numberofemp = numberofemp;
}

@Override
public String toString() {
	return "Company [companycode=" + companycode + ", companyname=" + companyname + ", numberofemp=" + numberofemp
			+ ", departmentnames=" + departmentnames + "]";
}
   
}
