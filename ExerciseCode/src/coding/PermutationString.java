package coding;

import java.util.Arrays;

public class PermutationString {
	
	public static void main(String[] args){
		String str1 = "123";
		String str2 = "321";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println(Arrays.equals(ch1, ch2));
		
	}
}
	
	
	

