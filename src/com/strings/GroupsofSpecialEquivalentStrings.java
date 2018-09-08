package com.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupsofSpecialEquivalentStrings {
	public static void main(String[] args) {
		GroupsofSpecialEquivalentStrings obj = new GroupsofSpecialEquivalentStrings();
		// String[] arr = { "abcd", "cdab", "adcb", "cbad" };
		String[] arr = { "a", "b", "c", "a", "c", "c" };
		System.out.println(obj.numSpecialEquivGroups(arr));
	}

	public int numSpecialEquivGroups(String[] arr) {
		if (arr == null) {
			return 0;
		}

		if (arr.length < 1) {
			return 0;
		}

		Set<String> set = new HashSet<>();
		for (String string : arr) {
			char[] charArray = string.toCharArray();
			StringBuffer even = new StringBuffer();
			StringBuffer odd = new StringBuffer();
			for (int i = 0; i < charArray.length; i++) {
				if (i % 2 == 0) {
					even.append(charArray[i]);
				} else {
					odd.append(charArray[i]);
				}
			}
			char[] evenArray = even.toString().toCharArray();
			char[] oddArray = odd.toString().toCharArray();
			Arrays.sort(evenArray);
			Arrays.sort(oddArray);

			set.add(new String(evenArray) + new String(oddArray));
		}

		return set.size();
	}

	public int numSpecialEquivGroups1(String[] A) {
		Set<String> set = new HashSet<>();
		for (String a : A)
			set.add(test(a));
		return set.size();
	}

	private String test(String s) {
		final int[] a = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97, 101, 103, 107, 109 };

		int[] x = new int[] { 1, 1 };
		char[] cs = s.toCharArray();

		for (int i = 0; i < cs.length; i++)
			x[i % 2] *= a[cs[i] - 'a'];
		return x[0] + "x" + x[1];
	}
}
