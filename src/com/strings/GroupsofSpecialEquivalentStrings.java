package com.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Pavan_Chitluri
 * 
 *         You are given an array A of strings.
 * 
 *         Two strings S and T are special-equivalent if after any number of
 *         moves, S == T.
 * 
 *         A move consists of choosing two indices i and j with i % 2 == j % 2,
 *         and swapping S[i] with S[j].
 * 
 *         Now, a group of special-equivalent strings from A is a non-empty
 *         subset S of A such that any string not in S is not special-equivalent
 *         with any string in S.
 * 
 *         Return the number of groups of special-equivalent strings from A.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: ["a","b","c","a","c","c"] 
 *         Output: 3 
 *         Explanation: 3 groups
 *         ["a","a"], ["b"], ["c","c","c"] 
 *         
 *         
 *         
 *         Example 2:
 *         Input: ["aa","bb","ab","ba"] 
 *         Output: 4 
 *         Explanation: 4 groups ["aa"], ["bb"], ["ab"], ["ba"] Example 3:
 * 
 *         Input: ["abc","acb","bac","bca","cab","cba"] 
 *         Output: 3 
 *         Explanation: 3
 *         groups ["abc","cba"], ["acb","bca"], ["bac","cab"] 
 *         
 *         Example 4:
 *         Input: ["abcd","cdab","adcb","cbad"] 
 *         Output: 1 
 *         Explanation: 1 group
 *         ["abcd","cdab","adcb","cbad"]
 *
 */

public class GroupsofSpecialEquivalentStrings {
	public static void main(String[] args) {
		GroupsofSpecialEquivalentStrings obj = new GroupsofSpecialEquivalentStrings();
//		 String[] arr = { "abcd", "cdab", "adcb", "cbad" };
		String[] arr = { "a", "b", "c", "a", "c", "c" };
		System.out.println(obj.numSpecialEquivGroups(arr));
		System.out.println(obj.numSpecialEquivGroups1(arr));
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
