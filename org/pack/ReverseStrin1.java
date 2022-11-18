package org.pack;

public class ReverseStrin1 {

	public static void main(String[] args) {

		String s= "iaH emocleW oT avaJ ssalC";
		
		String op="";
		
		String[] sp = s.split(" ");
		
		for (String w : sp) {
			String rev="";
			
			for (int i =w.length()-1; i >=0; i--) {
			
				rev=rev+w.charAt(i);
			}
				op=op+rev+" ";
		}
		System.out.println(op);
		
	
	}

}
