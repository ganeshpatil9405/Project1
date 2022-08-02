package string_examp;

import java.util.Scanner;

public class DisplayAllOccurance {

	public static void main(String[] args) {
//		
//		String str[]=s1.split(" ");
//		System.out.println(s1);
//		
//		System.out.println();
//		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String");
//		String ch=sc.nextLine();
		
		String s1="Java is a programming language";
		System.out.println(s1);
		
		char ch[]=s1.toCharArray();
		//int c[]=new int[ch.length];
		
	       for(int i=0; i<s1.length(); i++)
	       {
	    	   int cnt=1;
	    	   for(int j=i+1; j<s1.length(); j++)
	    	   {
	    		   if(ch[i]==ch[j])
	    		   {
	    			   cnt++;
	    			   ch[j]=' ';
	    		   }
	    	   }
	    	   if(ch[i]!=' ')
	    	   System.out.println(ch[i]+" "+cnt);
	       }
	       
	      
	}

}
