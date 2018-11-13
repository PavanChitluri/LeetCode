package com.numbers;

public class FactorialTrailingZeroes {
	public static void main(String[] args) {
		FactorialTrailingZeroes obj = new FactorialTrailingZeroes();
		System.out.println(obj.trailingZeroes(13));
	}

	public int trailingZeroes(int n) {
		// the number of trailing zeros is equal to the power of 5 in n!
		// sum( 5^1, 5^2, 5^3 ...)
		int count = 0;
		while (n > 1) {
			n /= 5;
			count += n;
		}
		return count;
	}

	/*
	 * public int trailingZeroes(int n) {
	 * 
	 * int total = 1; int count = 0; for (int i = 1; i <= n; i++) { total *= i; }
	 * 
	 * System.out.println(total); while (true) {
	 * 
	 * if (total % 10 == 0) { count++; total /= 10; } else { break; }
	 * 
	 * } return count; }
	 */
}
