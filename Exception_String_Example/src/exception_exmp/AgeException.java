package exception_exmp;
//                               RuntimeException   for runtime exception
public class AgeException extends Exception { //compile time exception
	
	public AgeException(String s)
	{
		super(s);
	}

}
