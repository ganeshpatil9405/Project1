package oracle_may5;

import java.util.Scanner;

public class factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number for Factorial");
	int num=sc.nextInt();
	int i=1;
	int fact=1;
	
	while(i<=num)
	{
		fact=fact*i;
		i++;
	}
	System.out.println("factorial of " +num+ " is= "+fact);
}
}
