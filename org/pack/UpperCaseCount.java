package org.pack;

public class UpperCaseCount {

	public static void main(String[] args) {

		String s = "JeNitH@098#!7AHm39ed";
		
		int upper=0, lower=0, specials=0, numbers=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if (Character.isUpperCase(c)) {
				
				upper++;
				
			}
			else if (Character.isLowerCase(c)) {
				
				lower++;
			}
			else if (Character.isDigit(c)) {
				
				numbers++;
				
			}
			else {
				specials++;
			}
		}
		System.out.println("Upper Case Count " + upper);
		System.out.println("Lower Case Count " + lower);
		System.out.println("Numbers Count " + numbers);
		System.out.println("Special Character Count " + specials);
		
	}

}
