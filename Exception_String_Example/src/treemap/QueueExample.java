package treemap;

import java.util.PriorityQueue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> qe=new PriorityQueue<>();
		
		qe.add(10);
		qe.add(20);
		qe.add(30);
		qe.add(40);
		qe.add(50);
		qe.add(60);
		qe.add(60);
		
		System.out.println(qe);
		
		qe.remove();//remove true or false
		System.out.println(qe);
		
		System.out.println("Peek "+qe.peek());//only return element but not remove
		
		System.out.println("Poll "+qe.poll());//remove as well as return element
		
		System.out.println(qe.size());//return size of queue
		
		System.out.println(qe);
	}

}
