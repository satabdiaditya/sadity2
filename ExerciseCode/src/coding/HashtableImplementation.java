package coding;

import java.util.*;

public class HashtableImplementation {

	public static void main(String[] args){
		Hashtable<Object, Object> phoneNumbers = new Hashtable<Object, Object>();
		
		phoneNumbers.put(123,"Satabdi Aditya");
		phoneNumbers.put(231,"ABCD");
		
		System.out.println(phoneNumbers.get(123));
		
		HashMap example = new HashMap<Object, Object>();
		
		example.put(1, 1);
		example.put(1, 1);
		
		
		System.out.println(example.hashCode());
		
	}
	
}
