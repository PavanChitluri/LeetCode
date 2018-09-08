package com.strings;

public class ReverseString {
	 public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		System.out.println(obj.reverseString("ABCDEF"));
	}
	 
	public String reverseString(String input) {
		char[] charArray = input.toCharArray();
		int length = charArray.length;
		int j=0;
		char[] newCharArray = new char[length];
		for (int i = length-1; i >= 0; i--) {
			newCharArray[j] = charArray[i];
			j++;
		}
		return new String(newCharArray);
	}
}
