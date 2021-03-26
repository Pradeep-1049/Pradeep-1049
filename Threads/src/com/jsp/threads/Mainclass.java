package com.jsp.threads;
class ThreadOne extends Thread
{
	@Override
	public void run()
	{
   for(int i=1;i<=3;i++)
   {
	   System.out.println("Task1");
   }

	}
	
}
class ThreadTwo extends Thread
{
	@Override
	public void run()
	{
   for(int j=1;j<=3;j++)
   {
	   System.out.println("Task2");
   }

	}
	
}
public class Mainclass {

	public static void main(String[] args) {
    System.out.println("Main starts....");
    ThreadOne t1=new ThreadOne();
    t1.start();
    
    ThreadTwo t2=new ThreadTwo();
    t2.start();
    System.out.println("Main starts....");

	}

}
