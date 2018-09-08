package com.bits;

public class BinaryNumerCountOne {

	public static void main(String[] args) {
		BinaryNumerCountOne obj = new BinaryNumerCountOne();
		obj.count_one(2);
		int sum = obj.getSum(1, -11);
		System.out.println(sum);
		
	}
	
	public int count_one(int n) {
		int count=0;
	    while(n >0 ) {
	        n = n&(n-1);
	        count++;
	    }
	    System.out.println(n);
	    return count;
	}
	
	int getSum(int a, int b) {
	    return b==0? a:getSum(a^b, (a&b)<<1); //be careful about the terminating condition;
	}
}
