package exception_exmp;

public class AgeExceptionExample {

	void validate(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("age is less,not allowed for rollerCoster Ride");
		}
		else if(age>60)
		{
			throw new AgeException("age is greater,not allowed for rollerCoster Ride");
		}
		else
		{
			System.out.println("Enjoy your ride");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 65;
		AgeExceptionExample aee = new AgeExceptionExample();
		
		try {
			aee.validate(age);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done");
		
	}

}
