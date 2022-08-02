package string1;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Java is a Programming language";
		
		String str[]=s1.split(" ");
		
		String s=" ";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			//s += s1[i] +" ";
		}
		System.out.println("Reversed String "+s.substring(0, s.length()-1));

	}

}
