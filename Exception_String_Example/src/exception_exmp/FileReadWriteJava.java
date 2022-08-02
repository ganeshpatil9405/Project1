package exception_exmp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWriteJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		//auto closable can be directly written along with try
		//try with resources
		
		try(FileInputStream fis=new FileInputStream("D://Test.txt");) {
			//fis= new FileInputStream("D://Test3.txt"); //read() A 65
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
		/*finally
		{
			System.out.println("output stream closed");
			fis.close();
		}*/
		
		
		/*fos = new FileOutputStream("D://Test.txt");
			String s="Java Sessions ThinkQuotient";
			for(int i=0;i<s.length();i++)
			{
				fos.write((int)s.charAt(i));
			}
			
		System.out.println();
		*/
		
		System.out.println("Done");

	}

}
