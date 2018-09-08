package com.bits;

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
	        int x=1,i=1;
	        while(x<=num && i<32){
	            num=num^x;
	            x=x<<1;
	            i++;
	        }

	        return num;
	    }
}
