package arraylist_assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Mon");
		al.add("Tue");
		al.add("Wed");
		al.add("Mon");
		al.add("Tue");
		al.add("Wed");
		al.add("Mon");
		al.add("Tue");
		al.add("Wed");
		
		System.out.println(al);
		
		ArrayList<String> l=new ArrayList<>();
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
				l.add(al.get(i));
			}
			
		}	
		;
		
		
	}

}
