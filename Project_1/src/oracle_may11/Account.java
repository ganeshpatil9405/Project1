package oracle_may11;

public class Account {
	
	int accno,balance;
	String name,contact;
	
	int getBalance()
	{
		return balance;
	}
	
	void setBalance(int balance)
	{
		this.balance=balance;
	}
	
	void setAccno(int accno)
	{
		this.accno=accno;
	}
	int getaccno()
	{
		return accno;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
		
	}
	
	void setContact(String contact)
	{
		this.contact=contact;
	}
	
	String getContact()
	{
		return contact;
	}
	
	public String toString()
	{
		return accno+" "+name+" "+balance+" "+contact+" ";
	}
	
	

}
