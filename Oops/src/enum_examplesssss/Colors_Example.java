package enum_examplesssss;

import java.util.Arrays;

public class Colors_Example {
	public static void main(String[] args) {
		
		System.out.println(Colors.GOLDEN);
		Colors c1=Colors.GOLDEN;
		
		System.out.println(c1.ordinal());
		
		Colors cr[]=Colors.values();
		for(Colors c:cr)
		{
			System.out.println(c);
		}
		System.out.println(Arrays.toString(cr));
	}

}
