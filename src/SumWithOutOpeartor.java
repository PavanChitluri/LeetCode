
public class SumWithOutOpeartor {

	/**
	 * Calculate the sum of two integers a and b, but you are not allowed to use the
	 * operator + and -.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		SumWithOutOpeartor obj = new SumWithOutOpeartor();
		System.out.println(obj.getSum(9, 28));
	}
	
	public int getSum(int a, int b) {
		return b==0?a: getSum(a^b, (a&b)<<1);
	}
}
