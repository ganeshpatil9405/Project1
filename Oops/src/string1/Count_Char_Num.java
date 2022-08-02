package string1;

import java.util.Scanner;

public class Count_Char_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		int alpha=0,num=0,space=0,special=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			char[] ch=str.toCharArray();
		
			if(Character.isLetter(ch[i]))
			{
				alpha++;
			}
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("Alphabets are= "+alpha);
		System.out.println("Numbers are ="+num);
		System.out.println("Spaces are: "+space);
		System.out.println("Special Character ="+special);
		
		sc.close();
		

	}

}
