package com.jsp.threads;
  class superclass{
	  
  }
  class task1 extends superclass implements Runnable
  {

	@Override
	public void run() {
		 for(int i=1;i<=3;i++)
		 {
			 System.out.println("task1");
		 }
	}
	  
  }
  class task2 extends Thread
  {

	@Override
	public void run() {
		 for(int j=1;j<=3;j++)
		 {
			 System.out.println("task2");
		 }
	}
	  
  }
public class Mainclass2 {

	public static void main(String[] args) {
   System.out.println("main starts........");
     task1 t1=new task1();

     Thread th1=new Thread(t1);
     th1.start();

     task2 t2=new task2();
     Thread th2=new Thread(t2);
     th2.start();

   
   
   System.out.println("main ends........");

	}

}
