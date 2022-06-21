package oracle_may11;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		Account a1=new Account();
		
		System.out.println("Enter Accno, Name, Balance,Contact");
		int accno=sc.nextInt();
		String name=sc.next();
		int amt=sc.nextInt();
		String contact=sc.next();
		
		a1.setAccno(accno);
		a1.setName(name);
		a1.setBalance(amt);
		a1.setContact(contact);
		
		System.out.println(a1);
		
		Bank b1=new Bank();
		
		
		b1.gpay(amt, a1);
		System.out.println(b1);
		sc.close();
		
		
	}

}
