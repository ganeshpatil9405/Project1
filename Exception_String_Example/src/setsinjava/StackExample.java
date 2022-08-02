package setsinjava;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		
		st.push(10);
		st.push(21);
		st.push(4);
		st.push(45);
		st.push(5);
		st.push(22);
		
		System.out.println(st);
		st.pop();
		System.out.println(st);
		
		System.out.println(st.contains(21));
		
		System.out.println(st.peek());
		
		System.out.println(st.empty());
		
		

	}

}
