package collectioninjava;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionFloatGeneric {
	
	public static void main(String[] args) {
		
		ArrayList<Float> f=new ArrayList<>();
		
		f.add(10.3f);
		f.add(14.5f);
		f.add(5.6f);
		f.add(10.3f);
		f.add(14.5f);
		f.add(5.6f);
		f.add(10.3f);
		f.add(14.5f);
		f.add(5.6f);
		
		System.out.println(f);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Float Number");
		float x=sc.nextFloat();
		int count=0;
		
		for(int i=0;i<f.size();i++)
		{
			if(f.get(i)==x)
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
