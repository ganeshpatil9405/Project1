package exception_exmp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileInputStream fis=new FileInputStream("D://Test.txt");)
		{
			int i;
			while((i=fis.read())!=-1)//-1 mark end of the file
			{
				System.out.print((char)i);
			}
			System.out.println();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
