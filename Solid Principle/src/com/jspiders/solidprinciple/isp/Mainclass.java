package com.jspiders.solidprinciple.isp;

public class Mainclass {

	public static void main(String[] args) {
		 HpMachine hp =new HpMachine();
		 hp.Scan();
		 
		 CannonMachine cannon=new CannonMachine();
		 cannon.Scan();		
		 cannon.Print();
		 
		 EpsonMachine epson =new EpsonMachine();
		 epson.Scan();
		 epson.Fax();
		 epson.Print();
	}

}
