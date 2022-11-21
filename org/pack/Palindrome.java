package org.pack;

public class Palindrome {

	public static void main(String[] args) {
		
		//Palindrome
		
		String s ="madam";
		
		String rev ="";
		
		for (int i =s.length()-1; i >=0; i--) {
			
			char c = s.charAt(i);
			
			rev = rev+c;
		}
		
		if (rev.equals(s)) {
			
			System.out.println("Palindrome");
			System.out.println("====================");
		} else {

			System.out.println("Not Palindrome");
			System.out.println("===================");
		}
		
	}
}
