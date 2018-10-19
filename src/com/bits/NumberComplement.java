package com.bits;

/**
 * @author Pavan_Chitluri Given a positive integer, output its complement
 *         number. The complement strategy is to flip the bits of its binary
 *         representation.
 * 
 *         Note: The given integer is guaranteed to fit within the range of a
 *         32-bit signed integer. You could assume no leading zero bit in the
 *         integer’s binary representation. 
 *         Example 1: 
 *         			Input: 5 Output: 2
 *         Explanation: The binary representation of 5 is 101 (no leading zero
 *         bits), and its complement is 010. So you need to output 2.
 *         Example 2:
 *         			Input: 1 Output: 0 
 *         Explanation: The binary representation of 1 is 1
 *         (no leading zero bits), and its complement is 0. So you need to
 *         output 0.
 */

public class NumberComplement {
	public static void main(String[] args) {
		NumberComplement obj = new NumberComplement();
		System.out.println(obj.findComplement(-5));
	}

	public int findComplement(int num) {
		int temp = 1;
		while (temp < num) {
			temp = temp << 1 | 1;
		}

		return num ^ temp;
	}

	public int findComplement1(int num) {
		int x = 1, i = 1;
		while (x <= num && i < 32) {
			num = num ^ x;
			x = x << 1;
			i++;
		}

		return num;
	}
}
