package exception_exmp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderException {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		File f= new File("D://Test.txt");
		FileWriter fw= null;
		FileReader fr=null;
		try {
			fw= new FileWriter(f);
			fw.write("Hello this is Java Sessions...welcome");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("file Reader closed");
			fw.close();
		}		
		
		try {
			fr = new FileReader(f);
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}	

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("Done");
		
	}

}
