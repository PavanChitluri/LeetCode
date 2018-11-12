package com.numbers;

/**
 * @author Pavan_Chitluri Write an algorithm to determine if a number is
 *         "happy".
 * 
 *         A happy number is a number defined by the following process: Starting
 *         with any positive integer, replace the number by the sum of the
 *         squares of its digits, and repeat the process until the number equals
 *         1 (where it will stay), or it loops endlessly in a cycle which does
 *         not include 1. Those numbers for which this process ends in 1 are
 *         happy numbers.
 * 
 *         Example:
 * 
 *         Input: 19 
 *         Output: true 
 *         Explanation: 1^2 + 9^2 = 82
 *         1^2 means square(1), square(9) 
 *         8^2 + 2^2 = 68 
 *         6^2 + 8^2 = 100 
 *         1^2 + 0^2 + 0^2 = 1
 *
 */

public class HappyNumber {
	public static void main(String[] args) {

	}

	public boolean isHappy(int n) {
		int x = n;
		int y = n;

		while (x > 1) {
			x = square(x);
			if (x == 1) {
				return true;
			}
			y = square(square(y));

			if (y == 1) {
				return true;
			}

			if (x == y) {
				return false;
			}

		}

		return false;
	}

	private int square(int n) {
		int x = n;
		int count = 0;
		while (x > 0) {
			count = count + (x % 10) * (x % 10);
			x = x / 10;
		}
		return count;
	}

}
