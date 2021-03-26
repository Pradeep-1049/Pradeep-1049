package strings;

import java.util.Arrays;

public class reverse
{
	public static void main(String[] args) 
	{
		//REVERSE THE STRING 
String str="a2356e";
char ch[]=str.toCharArray();
for(int i=ch.length-1;i>=0;i--)
{
System.out.println(ch[i]);	
}
System.out.println("=======================================");
//SWAPPING TWO NUMBERS
int a=10;
int b=5;

b=b+a;
a=b-a;
b=b-a;
System.out.println("Swaping two numbers :"+a +","+ b);

System.out.println("================================");
//COUNT VOWELS AND CONSONENTS
String s="I am a bad boy";
int vCount=0;
int cCount=0;
s=s.toLowerCase();
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	{
		vCount++;
	}
	else if(s.charAt(i)>='a'&& s.charAt(i)<='z')
	{
		cCount++;
	}
	
}
System.out.println("VOWELS COUNT :"+vCount);
System.out.println("Consonent COUNT :"+cCount);

System.out.println("=============================");

System.out.println("Given Palindrome num :"+checkPalindromeString("Bakb"));
System.out.println("=============================");
 int arr[]= {3,34,5,6,7,2};
 Arrays.sort(arr);
 System.out.println(Arrays.toString(arr));
























	}
	public static boolean checkPalindromeString(String input) {
		boolean res=true;
		input=input.toLowerCase();
		int length=input.length();
		for(int i=0;i<length/2;i++)
		{
			if(input.charAt(i)!=input.charAt(length-i-1))
			{
				res=false;
				break;
			}
		}
		return res;

	}
}
