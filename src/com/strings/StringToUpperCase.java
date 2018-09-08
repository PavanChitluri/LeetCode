package com.strings;

public class StringToUpperCase {
	
	public static void main(String[] args) {
		
		StringToUpperCase obj = new StringToUpperCase();
		System.out.println(obj.tpUpperCase("Pavan Kumar Chitluri"));
	}
	
	public String tpUpperCase(String input) {
	
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
