package collectioninjava;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIteratror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(20);
		
		System.out.println(al);
		
		Iterator<Integer> litr=al.iterator();
		while(litr.hasNext())//Traverse in Forward Direction
		{
			System.out.print(litr.next()); //Printing the Element
		}
		
		//Reverse Direction
		/*litr=al.listIterator(al.size());
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous());
		}*/

	}

}
