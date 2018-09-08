package com.strings;

public class JewelAndStone {
	public static void main(String[] args) {
		
		JewelAndStone obj = new JewelAndStone();
		System.out.print(obj.numJewelsInStones("aA", "aAAbbbb"));
	}
	
	public int numJewelsInStones(String J, String S) {
        int count =0;
        int charArray[] = new int[256];
        int jewelLength = J.length();
        int stoneLength = S.length();
        
        for ( int i=0; i <jewelLength; i++) {
            charArray[J.charAt(i)]++;
        }
       
        for ( int i=0; i <stoneLength; i++) {
        	if(charArray[S.charAt(i)] >0 ) {
        		count ++;
        	}
        }
        
        return count;
        
    }
}
