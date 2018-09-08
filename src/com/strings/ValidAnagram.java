package com.strings;
import java.util.Arrays;

public class ValidAnagram {
	public static void main(String[] args) {
		
		ValidAnagram obj = new ValidAnagram();
		boolean check = obj.isAnagram("anagram", "nagaram");
		System.out.println(check);
		
	}
	
	public boolean isAnagram2(String s, String t) {

		if (s == null || t == null) {
			return false;
		}

		if (s.length() != t.length()) {
			return false;
		}

		char[] source = s.toLowerCase().toCharArray();
		char[] target = t.toLowerCase().toCharArray();
		Arrays.sort(source);
		Arrays.sort(target);
		int length = source.length;
		boolean check = true;
		for (int i = 0; i < length; i++) {
			if (!(source[i] == target[i])) {
				check = false;
			}
		}
		return check;
	}
	
	
	public boolean isAnagram(String s, String t) {

		if (s == null || t == null) {
			return false;
		}

		if (s.length() != t.length()) {
			return false;
		}
		int[] charArray = new int[256];

		int length = s.length();

		for (int i = 0; i < length; i++) {
			charArray[s.charAt(i)]++;
		}

		for (int i = 0; i < length; i++) {
			charArray[t.charAt(i)]--;
		}
		int arrayLength = charArray.length;
		boolean check = true;
		for (int i = 0; i < arrayLength; i++) {
			if (charArray[i] > 0) {
				return false;
			}
		}

		return check;

	}
	
	
	
	
	
	
}
