package collectioninjava;

import java.util.ArrayList;
import java.util.Arrays;

public class TheaterArraytoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Theater> al=new ArrayList<Theater>();
		
		
		al.add(new Theater(101,"Inox",250000));
		al.add(new Theater(102,"Regimental",30000));
		al.add(new Theater(103,"gangadhar",650000));
		al.add(new Theater(104,"Indira",5500000));
		System.out.println(al);
		Theater a[]=new Theater[al.size()];
		
		al.toArray(a);
		System.out.println("Object Array :"+Arrays.toString(a));
		
		for(Theater s:a)
		{
			if(s.name.startsWith("I"))
			{
				System.out.println(s.name+" "+s.collectionsinoned);
			}
		}
		

	}

}
