package com.jspiders.designpattern.pkg1;

public class Mainclass {

	public static void main(String[] args) {
Product user1=Product.getInstance();
System.out.println(user1.name);
System.out.println(user1.price);

Product user2=Product.getInstance();
System.out.println(user2.name);
System.out.println(user2.price);



	}

}
