package enum_examplesssss;

interface A
{
	void description();
}

public enum BookMyShow implements A {
	
	SILVER(150)
	{
		public void description()
		{
			System.out.println("Rate of Silver Ticket");
		}
		public String toString()
		{
			return "Ticket price is Rs.150";
		}
		
	},
	GOLD(200)
	{
		public void description()
		{
			System.out.println("Rate of Gold Ticket");
		}
		public String toString()
		{
			return "Ticket Price is Rs.200";
			
		}
	},
	PLATINUM(300)
	{
		public void description()
		{
			System.out.println("Rate of Platinum Ticket");
		}
		public String toString()
		{
			return "Ticket Price is Rs.300";
		}
	};
	
	int rate;
	
	private BookMyShow(int rate)
	{
		this.rate=rate;
	}
	
	void message()
	{
		System.out.println("The Ticket Price is "+rate);
	}
	

}
