package assignment_Inheritance;

import java.util.Scanner;

public class Laptop_Main extends Laptop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No of Usb Ports, Processor speed");
		
		int noOfUSBPorts=sc.nextInt();
		int processorSpeed=sc.nextInt();
		
		Laptop l=new Laptop();
		l.setNoOfUSBPorts(noOfUSBPorts);
		l.setProcessorSpeed(processorSpeed);
		
		System.out.println(l.getNoOfUSBPorts());
		System.out.println(l.getProcessorSpeed());
	}

}
