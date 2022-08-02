package collectioninjava;

import java.util.ArrayList;

public class CollectionNonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(4.5);
		al.add("Sandesh");
		al.add(50);
		al.add(new Stud(10,90,"Sandesh"));
		al.add(new Stud(2,80,"Saurabh"));
		System.out.println(al);
		
		for(Object o:al)
		{
			String s=o.getClass().getName();
			if(s.equalsIgnoreCase("collectioninjava.stud"));
			System.out.println(o);
		}

	}

}
