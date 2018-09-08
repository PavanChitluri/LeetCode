package com.strings;

public class ShortestDistanceToCharacter {

	public static void main(String[] args) {
		ShortestDistanceToCharacter obj = new ShortestDistanceToCharacter();
		obj.shortestToChar("loveleetcode", 'e');
	}

	public int[] shortestToChar(String S, char C) {
		int[] res = new int[S.length()];

		int last = Integer.MAX_VALUE;
		int next = S.indexOf(C);
		int current = 0;
		int diff;
		while (current < S.length()) {
			diff = Math.min(Math.abs(current - last), Math.abs(next - current));
			res[current] = diff;
			if (current == next) {
				last = next;
				next = S.indexOf(C, current + 1);
				System.out.println("next "+next);
				if (next == -1) {
					next = Integer.MAX_VALUE;
				}
			}
			current++;

		}

		return res;
	}
}
