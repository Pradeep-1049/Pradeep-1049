package com.jspiders.solidprinciple.isp;

public class EpsonMachine implements FaxMachine ,ScanMachine,PrinMachine{

	@Override
	public void Fax() {
		// TODO Auto-generated method stub
		System.out.println("Faxing by ....EpsonMACHINE");

	}

	@Override
	public void Print() {
		// TODO Auto-generated method stub
		System.out.println("Printing by ....EpsonMachine");

	}

	@Override
	public void Scan() {
		// TODO Auto-generated method stub
		System.out.println("Scanning by ...EpsonMachine");

	}

}
