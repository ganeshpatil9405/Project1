package arraylist_assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_Integer_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			int count=0;
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i)==al.get(j) && j<i)
				{
					break;
				}
				else if(al.get(i)==al.get(j) && j>=i)
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.print(al.get(i)+" ");
			}
			
		}	
		
	}

}


