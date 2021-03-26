package com.jspiders.solidprinciple.isp;

public class CannonMachine implements PrinMachine,ScanMachine {

	@Override
	public void Print() {
		// TODO Auto-generated method stub
System.out.println("Printing by ....Cannon");
	}

	@Override
	public void Scan() {
		// TODO Auto-generated method stub
System.out.println("Scanning by...CannonMachine");
}

}
