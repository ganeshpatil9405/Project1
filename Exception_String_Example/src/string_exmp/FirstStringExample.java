package string_exmp;

import java.util.Arrays;

public class FirstStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//         0123
		String s1="     Java     "; //Literals
		String s2="Languagesag";
		String s3="Java";
		String s4= new String("Java");  //new keyword
		String s5="java";
		String s6=new String("Java");
		
		System.out.println(s1+" /"+s1.trim());//before and after spaces
		
		System.out.println(s4==s6);
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.compareTo(s2));//Java Language
		//s1>s2   +ve   ascii(s1)-ascii(s2)
		//s1<s2  -ve     ascii(s1)-ascii(s2)
		//s1==s2   0     ascii(s1)-ascii(s2)
		
		
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println("Length "+ s1.length());
		System.out.println("CharAt: "+s1.charAt(2)); //Java
		
		System.out.println("Indexof: "+s2.indexOf("ag") +" "+s2.indexOf('g', 4));  //Languagesag
		System.out.println("LastIndexOf "+s2.lastIndexOf("ag")); //last occurance of tthe string
		
		System.out.println("startswith: "+s2.startsWith("L"));
		System.out.println("Ends With: "+s2.endsWith("sag"));
		
		System.out.println("Replace: "+s2.replace("ag","AG"));
		System.out.println(s2);
		
		System.out.println(s2.replaceFirst("L", "la"));
		
		
		System.out.println("Substring: "+s2.substring(6));  //Languagesag
		
		System.out.println(s2.substring(4, 9));  //9-4=5
		
		System.out.println(s2.isEmpty());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		
		char ch[]=s2.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
		String ss="Java is a programming language";
		String str[]=ss.split(" ");
		System.out.println(Arrays.toString(str));

	}

}
