package com.array;

public class MonotonicArray {
	public static void main(String[] args) {
		MonotonicArray obj = new MonotonicArray();
		// int[] elemets = { 2, 2, 2, 1, 4 };
		int[] elemets = {1,3,2};
		System.out.println(obj.isMonotonic(elemets));

	}

	public boolean isMonotonic(int[] elements) {
		boolean inc = true, dec = true;
		for (int i = 1; i < elements.length; i++) {
			if (inc && elements[i-1] > elements[i]) {
				inc = false;
			}

			if (dec && elements[i-1] < elements[i]) {
				dec = false;
			}

		}
		return inc || dec;
	}

	public boolean isMonotonic1(int[] elements) {
		int length = elements.length;
		int prev = elements[0];
		int curr = elements[1];
		boolean inc = false, dec = false;
		if (prev < curr) {
			inc = true;
		}
		if (prev > curr) {
			dec = true;
		}
		prev = curr;
		for (int i = 2; i < elements.length; i++) {
			curr = elements[i];
			if (prev < curr) {
				if (dec) {
					return false;
				}
				if (!inc && !dec) {
					inc = true;
				}
			} else if (prev > curr) {
				if (inc) {
					return false;
				}
				if (!inc && !dec) {
					dec = true;
				}
			}
			prev = curr;
		}
		return true;
	}

}
