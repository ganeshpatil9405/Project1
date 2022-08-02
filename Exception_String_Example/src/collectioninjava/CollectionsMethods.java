package collectioninjava;

import java.util.ArrayList;

public class CollectionsMethods {

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
		
		al.add(3, 200);
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);//Remove index position number
		
		/*al.clear();
		System.out.println(al);//Remove array elements but not array*/
		
		System.out.println(al.get(4));
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf(30)+" "+al.lastIndexOf(20));
	
		
		System.out.println(al.contains(50));
		
		System.out.println(al.set(2, 200));
		System.out.println(al);
		
		list.add(1000);
		list.add(200);
		list.add(3000);
		
		al.addAll(list);//index Collection
		System.out.println(al);
		
		/*al.removeAll(list);
		System.out.println(al);*/
		
		al.retainAll(list);
		System.out.println(al);
		
		System.out.println(al.containsAll(list));
		
	}

}
