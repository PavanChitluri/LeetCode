package com.strings;

public class StringToUpperCase {
	
	public static void main(String[] args) {
		
		StringToUpperCase obj = new StringToUpperCase();
		System.out.println(obj.toUpperCase("Pavan Kumar Chitluri"));
	}
	
	public String toUpperCase(String input) {
		input.toUpperCase();
	
		char[] charArray = input.toCharArray();
		int length = charArray.length;
		for (int i = 0; i < length; i++) {
			if(charArray[i] >= 'a' && charArray[i] <= 'z') {
				charArray[i]-=32;
			}
		}
		return new String(charArray);
	}
	
}
