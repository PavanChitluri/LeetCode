
public class IntegerToRoman {
	public static void main(String[] args) {
		IntegerToRoman obj = new IntegerToRoman();
	}

	public String intToRoman(int num) {

		StringBuilder romanNumBuilder = new StringBuilder();
		int x = num;
		while (x > 0) {
			if (x < 4) {
				x = x - 1;
				romanNumBuilder.append("I");
			} else if (x == 4) {
				romanNumBuilder.append("IV");
				x = x - 4;
			} else if (x < 9) {
				romanNumBuilder.append("V");
				x = x - 5;
			} else if (x == 9) {
				romanNumBuilder.append("IX");
				x = x - 9;
			} else if (x < 40) {
				romanNumBuilder.append("X");
				x = x - 10;
			} else if (x < 50) {
				romanNumBuilder.append("XL");
				x = x - 40;
			} else if (x < 90) {
				romanNumBuilder.append("L");
				x = x - 50;
			} else if (x < 100) {
				romanNumBuilder.append("XC");
				x = x - 90;
			} else if (x < 400) {
				romanNumBuilder.append("C");
				x = x - 100;
			} else if (x < 500) {
				romanNumBuilder.append("CD");
				x = x - 400;
			} else if (x < 900) {
				romanNumBuilder.append("D");
				x = x - 500;
			} else if (x < 1000) {
				romanNumBuilder.append("CM");
				x = x - 900;
			} else {
				romanNumBuilder.append("M");
				x = x - 1000;
			}
		}
		return romanNumBuilder.toString();
	}
	
	
	/*public static String intToRoman(int num) {
	    String M[] = {"", "M", "MM", "MMM"};
	    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	    return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
	}*/
}
