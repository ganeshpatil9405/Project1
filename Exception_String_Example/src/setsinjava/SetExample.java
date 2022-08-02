package setsinjava;

import java.util.HashSet;

public class SetExample {
	
	static void average(HashSet<Integer> hs)
	{
		int sum=0;
		for(Integer i:hs)
		{
			sum=sum+i;
		}
		System.out.println("Average:"+sum/hs.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs=new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(50);
		hs.add(40);
		hs.add(30);
		hs.add(20);
		average(hs);

	}

}
