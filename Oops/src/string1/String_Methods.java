package string1;

import java.util.Arrays;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Java";
		String s2="Languages";
		String s3="Java";
		String s4=new String("Java");
		String s5="java";
		String s6=new String("Java");
		
		
		System.out.println(s4==s6);
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.compareTo(s3));//Java java
		// s1>s2   +ve
		//s1<s2    -ve
		//s1==s2   0 
		
		
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println("Length "+s1.length());
		System.out.println("Char At : "+s1.charAt(2));
		
		System.out.println("Index of : "+s2.indexOf("ag")+" "+s2.indexOf('g', 4));
		System.out.println("LastIndex Of : "+s2.lastIndexOf("ag"));
		
		System.out.println("Startswith :"+s2.startsWith("L"));
		System.out.println("Ends with :"+s2.endsWith("ges"));
		
		System.out.println("Replace : "+s2.replace("ges", "GES"));
		System.out.println(s2);
		
		System.out.println(s2.replaceFirst("L", "la"));
		System.out.println(s2);
		
		
		System.out.println("SubString "+s2.substring(6));
		
		System.out.println(s2.substring(4, 6));
		
		System.out.println(s2.isEmpty());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		char ch[]=s2.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		String ss="Java is Programming Languages";
		String str[]=ss.split(" ");
		System.out.println(Arrays.toString(str));
		
	}

}
