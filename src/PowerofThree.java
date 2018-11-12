
/**
 * 
 * @author Pavan_Chitluri Given an integer, write a function to determine if it
 *         is a power of three. 
 * 
 * 		   Logic : pow(3,n) -- > 3^n 
 *         Example 1:
 *         Input: 27 Output: true
 *         
 *         Example 2:
 *         Input: 0 Output: false 
 *         
 *         Example 3:
 *         Input: 9 Output: true 
 *         
 *         Example 4:
 *         Input: 45 Output: false
 */

public class PowerofThree {
	public static void main(String[] args) {
		PowerofThree obj = new PowerofThree();
		System.out.println(obj.isPowerOfThree(81));

	}

	public boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return false;
		}

		while (n != 1) {
			if (n % 3 == 0) {
				n /= 3;
			} else {
				return false;
			}
		}

		return true;
	}

	public boolean isPowerOfThreeRecursion(int n) {
		return n > 0 && (n == 1 || n % 3 == 0 && isPowerOfThree(n / 3));

	}
}
