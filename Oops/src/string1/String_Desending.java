package string1;

public class String_Desending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I am Good";
		String s1[]=str.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[s1.length-(i+1)]+" ");
		}
		
		System.out.println();

	}

}
