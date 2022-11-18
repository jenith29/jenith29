package org.pack;

import java.util.Iterator;

public class ReverseStrin {

	public static void main(String[] args) {

		//String Reverse
		
		String s ="Greens";
		String rev ="";
		
		for (int i =s.length()-1; i>=0; i--) {
			
			char c = s.charAt(i);
			rev = rev + c;
			
		}
		
		System.out.println(rev);
		
	}

}
