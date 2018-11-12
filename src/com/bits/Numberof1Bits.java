package com.bits;

public class Numberof1Bits {
	public static void main(String[] args) {
		Numberof1Bits obj = new Numberof1Bits();
		System.out.println(obj.hammingWeight(128));
		System.out.println(obj.hammingWeight2(128));
	}

	public int hammingWeight(int n) {
		return Integer.bitCount(n);
	}

	public int hammingWeight2(int n) {

		int count = 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				count++;
			}
			n = n >> 1;

		}
		return count;
	}

}
