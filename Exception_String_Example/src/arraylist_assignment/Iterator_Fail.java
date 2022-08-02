package arraylist_assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Fail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator<Integer> it= al.iterator();
		
		while(it.hasNext())
		{
			Integer integer=(Integer) it.next();
			al.add(100);
		}

	}

}
