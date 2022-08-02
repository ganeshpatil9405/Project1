package string1;

import java.util.Scanner;

public class Remove_Char_Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		System.out.println("Enter Character to delete from String");
		char del_char=sc.next().charAt(0);
		
		String after_delete=str.replace(del_char, Character.MIN_VALUE);
		System.out.println("After Deleting "+del_char+" Character"+after_delete);
		
		
		

	}

}
