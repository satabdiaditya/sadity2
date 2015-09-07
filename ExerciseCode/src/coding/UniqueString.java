package coding;

//an algorithm to determine if a string has all unique characters without any data structure
/* does not work on string with number...
 * http://stackoverflow.com/questions/19484406/detecting-if-a-string-has-unique-characters-comparing-my-solution-to-cracking
 * 
 */

public class UniqueString {
	

	public static void main(String[] args){
		String str = "sat123";
		System.out.println(uniqueChars(str));
	}
	    // Assume every character in string is between a to z.
	public static boolean uniqueChars(String str) {
		  if (str.length() > 256) { // NOTE: Are you sure this isn't 26?
		        return false;
		    }
		    int checker = 0;
		    for (int i = 0; i < str.length(); i++) {
		        int val = str.charAt(i) - 'a';
		        if ((checker & (1 << val)) > 0) return false;
		        checker |= (1 << val);
		    }
		    return true;
	    }
	
 
}
