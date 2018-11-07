package com.strings;

public class ReverseWords {
	public static void main(String[] args) {
		ReverseWords obj = new ReverseWords();
		System.out.println(obj.reverseWords4("Pavan Kumar Chitluri "));
	}

	public String reverseWords2(String str) {
		if (str == null) {
			return str;
		}
		int length = str.length();
		if (length < 2) {
			return str;
		}
		int i = 0;
		int j = 0;
		char[] chars = str.toCharArray();
		for (int k = 0; k < length; k++) {
			j = str.indexOf(' ', j);
			if (j > -1) {
				chars = reverseString(chars, i, j - 1);
				j++;
				i = j;
			} else {
				break;
			}
		}
		chars = reverseString(chars, i, chars.length - 1);
		return new String(chars);
	}

	private char[] reverseString(char[] chars, int i, int j) {
		while (i < j) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
			i++;
			j--;
		}
		return chars;
	}

	public String reverseWords1(String str) {
		if (str == null) {
			return str;
		}
		if (str.length() < 2) {
			return str;
		}

		String newString = "";
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			char[] chars = split[i].toCharArray();
			int p1 = 0;
			int p2 = chars.length - 1;
			while (p1 < p2) {
				char temp = chars[p1];
				chars[p1] = chars[p2];
				chars[p2] = temp;
				p1++;
				p2--;
			}
			newString = newString + new String(chars) + " ";
		}
		System.out.println(newString);
		return newString.trim();
	}

	public String reverseWords(String s) {
		String str = "";
		String temp = "";
		for (int i = 0; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) == ' ') {
				str += temp + " ";
				temp = "";
			} else {
				temp = s.charAt(i) + temp;
			}
			System.out.println(temp);
		}
		return str.trim();
	}
	
	
	public String reverseWords4(String s) {
        String[] splitList = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < splitList.length; i++) {
            sb.setLength(0);
            sb.append(splitList[i]);
            splitList[i] = sb.reverse().toString();
        }
        return String.join(" ", splitList);
    }

}
