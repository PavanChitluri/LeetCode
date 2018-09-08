package com.bits;

public class HammingDistance {

	public static void main(String[] args) {

		HammingDistance obj = new HammingDistance();
		System.out.println(obj.hammingDistance(1, 4));

	}

	public int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}
	
	
	public int hammingDistance1(int x, int y) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((x & 1) != (y & 1)) res++;
            y >>= 1;
            x >>= 1;
        } 
        return res;
    }

	public int hammingDistance2(int x, int y) {
		int count = 0;
		int temp = x ^ y;

		while (temp > 0) {
			System.out.println(temp);
			int flag = temp ^ 1;
			if (flag < temp) {
				count++;
			}
			temp = temp >> 1;
		}
		System.out.println("count " + "" + count);
		return count;
	}

}
