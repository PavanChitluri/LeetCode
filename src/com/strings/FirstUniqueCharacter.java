package com.strings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstUniqueCharacter {
	public static void main(String[] args) {
		
		FirstUniqueCharacter obj = new FirstUniqueCharacter();
		System.out.println(" char "+obj.getChar("anusha"));
		System.out.println(" char "+obj.findChar("anusha"));
	}

	private int getChar(String string) {
		Set<Character> set = new HashSet<>();
		List<Character> list = new ArrayList<>();
		if (string == null || string.length() < 1) {
			return -1;
		}

		int length = string.length();
		for (int i = 0; i < length; i++) {
			Character c = string.charAt(i);
			if (set.add(c)) {
				list.add(c);
			} else {
				list.remove(c);
			}

		}

		if (list.size() < 1) {
			return -1;
		}
		return string.indexOf(list.get(0));
	}
	
	
	public int findChar(String s) {
		int[] arr = new int[26];
		if (s == null || s.length() < 1) {
			return -1;
		}

		int length = s.length();
		for (int i = 0; i < length; i++) {
			arr[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < length; i++) {
			if (arr[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}

		return -1;
	}
	

}
