package org.pack;

public class Pascal {

	public static void main(String[] args) {

		String s ="hai welcome to java class";
		
		String op="";
		
		String[] sp = s.split(" ");
		
		for (String x : sp) {
			
			char first = x.charAt(0);

			char upperCase = Character.toUpperCase(first);
			
			String remaining = x.substring(1);
			
			op=op+upperCase+remaining+" ";
			
		}
		System.out.println(op);
		
		}
		
	}

