package collectioninjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		/*for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check Occurance");
		int x=sc.nextInt();
		int count=0;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)==x)
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
