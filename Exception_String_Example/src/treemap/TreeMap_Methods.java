package treemap;

import java.util.TreeMap;

public class TreeMap_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(5,"Rohan");
		tm.put(1, "Rakesh");
		tm.put(101,"Saurabh");
		tm.put(500, "SAndesh");
		tm.put(85,"Akshay");
		tm.put(55, "Harshal");
		tm.put(21,"Ram");
		tm.put(6, "Gaurav");
		tm.put(90,"Vikas");
		tm.put(45, "Pandu");
		tm.put(44,"Nikesh");
		tm.put(250, "Sumit");
		
		System.out.println(tm);
		
		System.out.println(tm.descendingMap());
		

	}

}
