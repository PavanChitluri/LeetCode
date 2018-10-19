package com.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Pavan_Chitluri We are given two sentences A and B. (A sentence is a
 *         string of space separated words. Each word consists only of lowercase
 *         letters.)
 * 
 *         A word is uncommon if it appears exactly once in one of the
 *         sentences, and does not appear in the other sentence.
 * 
 *         Return a list of all uncommon words.
 * 
 *         You may return the list in any order.
 * 
 * 
 *         Example 1:
 * 
 *         Input: A = "this apple is sweet", B = "this apple is sour" Output:
 *         ["sweet","sour"] Example 2:
 * 
 *         Input: A = "apple apple", B = "banana" Output: ["banana"]
 */

public class UncommonWords {

	public static void main(String[] args) {
		String A = new String("d b zu d t");
		String B = new String("udb zu ap");
		UncommonWords words = new UncommonWords();
		words.uncommonFromSentences(A, B);

	}

	public String[] uncommonFromSentences(String A, String B) {

		String[] aWords = A.split(" ");
		String[] bWords = B.split(" ");
		List<String> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		for (String string : aWords) {
			map.put(string, map.getOrDefault(string,0) + 1);
		}
		for (String string : bWords) {
			map.put(string, map.getOrDefault(string,0) + 1);
		}
		
		for (String entry : map.keySet()) {
			if (map.get(entry)==1) {
				list.add(entry);
			}

		}

		return list.stream().toArray(String[]::new);
	}
}
