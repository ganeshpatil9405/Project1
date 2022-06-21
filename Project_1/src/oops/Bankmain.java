package oops;

public class Bankmain {
	public static void main(String[] args) {
		customer c1=new customer();
		
		c1.setAccno(10123);
		c1.setName("Rupesh");
		c1.setBalance(50000);
		c1.setContact("90124222");
		
		c1.setBalance(100000);
		
		System.out.println(c1.getAccno()+" "+c1.getName()+" "+c1.getBalance()+" "+c1.getContact()+" ");
	}

}
