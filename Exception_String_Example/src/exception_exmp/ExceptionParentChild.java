package exception_exmp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class AB
{
	void display() throws IOException
	{
		System.out.println("in parent class");
	}
}

class BC extends AB
{
	void display() throws IOException
	{
		System.out.println("in child class");
	}
}

public class ExceptionParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
