package org.pack;

public class UpperCaseWords {

	public static void main(String[] args) {

	String s = "JeNitH@098#!7AHm39ed";
		
		String upper="", lower="", specials="", numbers="";
	
	for (int i = 0; i < s.length(); i++) {
		
		char c = s.charAt(i);
		
		int x=c;
		
		if (x>=65 && x<=90) {
			
			upper= upper+c;
		}
		else if (x>=97 && x<=122) {
			
			lower= lower+c;
		}
		else if (x>=48 && x<=57) {
			
			numbers= numbers+c;
		}
		else {
			specials= specials+c;
		
		}
	}

	System.out.println("Upper Case words " + upper);
	System.out.println("Lower Case words " + lower);
	System.out.println("Numbers " + numbers);
	System.out.println("Special Character " + specials);
	}
}
