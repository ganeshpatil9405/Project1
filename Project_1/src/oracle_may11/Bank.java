package oracle_may11;

public class Bank {
	
	void gpay(int amt,Account a)
	{
		int bal=a.getBalance();
		System.out.println("Balance is "+bal);
		
		if(bal>amt)
		{
			bal=bal-amt;
			a.setBalance(bal);
			System.out.println("Remaining balance is "+a.getBalance());
			
		}
		else
		{
			System.out.println("Not Enough Balance in your Account");
		}
		
	}

}
