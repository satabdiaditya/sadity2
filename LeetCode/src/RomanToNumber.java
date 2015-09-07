
//Given a roman numeral, convert it to an integer.

//Input is guaranteed to be within the range from 1 to 3999.


public class RomanToNumber {
	
	public static void main(String[] args){
		String str = "XLIX";
		System.out.println(romanToInt(str));
	}
	
	public static int romanToInt(String str){
		int num = 0;
		char[] chRoman = str.toCharArray();
		int length = str.length();
		for(int i = length-1;i>=0 ; i--){
			//System.out.println(chRoman[i]);
			if(i>0 &&(rank(chRoman[i]) > rank(chRoman[i-1]))) {
				num = num + helper(chRoman[i]) - helper(chRoman[i-1]);
				i=i-1;
			}
			else num = num+helper(chRoman[i]);
		}
		return num;
	}
	
	public static int helper(char c){
		if(c == 'I') return 1;
		if(c == 'V') return 5;
		if(c == 'X') return 10;
		if(c == 'L') return 50;
		if(c == 'C') return 100;
		if(c == 'D') return 500;
		if(c == 'M') return 1000;
		else return 0;
	}
	public static int rank(char c){
		if(c == 'I') return 1;
		if(c == 'V') return 2;
		if(c == 'X') return 3;
		if(c == 'L') return 4;
		if(c == 'C') return 5;
		if(c == 'D') return 6;
		if(c == 'M') return 7;
		else return 0;
	}

}
