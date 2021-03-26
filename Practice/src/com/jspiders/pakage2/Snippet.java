package com.jspiders.pakage2;

public class Snippet {
	public static void main(String[] args) {
	   String str="de ece efrv rfrv";
	   str=str.toLowerCase();
	   int vCount=0;
	   int cCount=0;
	    for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vCount++;
			}
		}
	    for (int j = 0; j < str.length(); j++) {
			if(str.charAt(j)>='a'&&str.charAt(j)<='z')
			{
				cCount++;
			}
		}
	    System.out.println("Vowels "+vCount);
	    System.out.println("Consonent "+cCount);

	}
}

