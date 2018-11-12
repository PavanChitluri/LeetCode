package com.bits;

/**
 * 
 * @author Pavan_Chitluri
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * 
 * 	Example 1:
		Input: a = 1, b = 2
		Output: 3

	Example 2:
		Input: a = -2, b = 3
		Output: 1
 *
 */

public class SumTwoIntegers {
	public static void main(String[] args) {
		SumTwoIntegers obj = new SumTwoIntegers();
		System.out.println("sum: "+obj.getSum(10, 12));

	}

	public int getSum(int a, int b) {
		return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
	}
}
