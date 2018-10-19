package com.strings;

/**
 * 
 * @author Pavan_Chitluri
 *
 *         You're given strings J representing the types of stones that are
 *         jewels, and S representing the stones you have. Each character in S
 *         is a type of stone you have. You want to know how many of the stones
 *         you have are also jewels.
 * 
 *         The letters in J are guaranteed distinct, and all characters in J and
 *         S are letters. Letters are case sensitive, so "a" is considered a
 *         different type of stone from "A".
 * 
 *         Example 1:
 *         Input: J = "aA", S = "aAAbbbb" 
 *         Output: 3 
 *         
 *         Example 2:
 *         Input: J = "z", S = "ZZ" 
 *         Output: 0 Note:
 * 
 *         S and J will consist of letters and have length at most 50. The
 *         characters in J are distinct.
 * 
 */

public class JewelAndStone {

	public static void main(String[] args) {

		JewelAndStone obj = new JewelAndStone();
		System.out.print(obj.numJewelsInStones("aA", "aAAbbbb"));
	}

	public int numJewelsInStones(String J, String S) {
		int count = 0;
		int charArray[] = new int[256];
		int jewelLength = J.length();
		int stoneLength = S.length();

		for (int i = 0; i < jewelLength; i++) {
			charArray[J.charAt(i)]++;
		}

		for (int i = 0; i < stoneLength; i++) {
			if (charArray[S.charAt(i)] > 0) {
				count++;
			}
		}

		return count;
	}
}
