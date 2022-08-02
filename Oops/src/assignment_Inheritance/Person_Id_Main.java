package assignment_Inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class Person_Id_Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Person P[]=new Person[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id,Pname,Contact,Adderess");
			
			int id=sc.nextInt();
			String pname=sc.next();
			String contact=sc.next();
			String adderess=sc.next();
			
			Idproof arr[]=new Idproof[3];
			
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter idname,number,vaidity ");
				String idname=sc.next();
				String number=sc.next();
				int validity=sc.nextInt();
				
				arr[j]=new Idproof(idname,number,validity);
				
			}
			P[i]=new Person(id,pname,contact,adderess,arr);
			
		}
		System.out.println(Arrays.toString(P));
		for(Person p:P)
		{
			for(Idproof d: p.arr)
			{
				if(p.adderess.equals("Pune") && d.idname.equals("Adharcard"))
				{
					System.out.println(p.pname+" "+p.contact+" "+p.adderess+" "+d.idname);
				}
			}
		}
		
	}

}
