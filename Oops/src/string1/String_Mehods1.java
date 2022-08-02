package string1;

public class String_Mehods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Java";
		String s2=" is a Programming Languages";
		String s3="languagess";
		String s4="JAVASCRIPT";
		
		System.out.println("Length is : "+s1.length());
		System.out.println("Lenghth is : "+s2.length());
		
		String s=s1.concat(s2);
		System.out.println(s);
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toLowerCase());

	}

}
