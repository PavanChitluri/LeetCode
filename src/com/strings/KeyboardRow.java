package com.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {
	public static void main(String[] args) {
		KeyboardRow obj = new KeyboardRow();
		String[] arr = { "Hello", "Alaska", "Dad", "Peace" };
		System.out.println(obj.findWords(arr));
	}

	public String[] findWords(String[] words) {
		if (words == null) {
			return null;
		}

		List<String> list = new ArrayList<>();
		list.add("QWERTYUIOP");
		list.add("ASDFGHJKL");
		list.add("ZXCVBNM");
		int value = 1;
		Map<Character, Integer> map = new HashMap<>();
		for (String string : list) {
			for (char c : string.toUpperCase().toCharArray()) {
				map.put(c, value);
			}
			value++;
		}
		List<String> valid = new ArrayList();
		for (String word : words) {
			char[] arr = word.toUpperCase().toCharArray();
			int check = map.get(arr[0]);
			for (char c : arr) {
				if (!(check == map.get(c))) {
					check = -1;
					break;
				}
			}
			if (check > 0) {
				valid.add(word);
			}
		}
		System.out.println(valid);
		return valid.toArray(new String[0]);
	}

	public String[] findWords1(String[] words) {
		if (words == null || words.length == 0)
			return new String[0];
		int[] levels = { 2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3 };
		List<String> l = new ArrayList<>();
		for (String str : words) {
			if (str == null || str.length() == 0)
				continue;
			int level = levels[normalize(str.charAt(0))], i = 1;
			for (; i < str.length(); i++)
				if (levels[(normalize(str.charAt(i)))] != level)
					break;
			if (i == str.length())
				l.add(str);
		}
		return l.toArray(new String[0]);
	}

	private int normalize(char c) {
		return c >= 'A' && c <= 'Z' ? c - 'A' : c - 'a';

	}
}
