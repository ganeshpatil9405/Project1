package class_object_homw;

import java.util.Scanner;

public class Box {
	double length,breadth,height,Volume;
	void acceptMeasures(double l,double b, double h)
	{
		length=l;
		breadth= b;
		height= h;
	}
	void Volume()
	{
		double Volume=length*breadth*height;
	}
	public String toString()
	{
		return ("Volume of Box is= "+(length*breadth*height));
	}
	public static void main(String[] args) {
		double length,breadth,height,Volume;
		Scanner sc=new Scanner(System.in);
		
		Box b1=new Box();
		
		System.out.println("Enter Length, Breadth & height ");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
		height=sc.nextDouble();
		b1.acceptMeasures(length,breadth,height);
		System.out.println(b1);
		}
	

}
