
/**
 * @author Pavan_Chitluri
 * 
 *         You are climbing a stair case. It takes n steps to reach to the top.
 *         Each time you can either climb 1 or 2 steps. In how many distinct
 *         ways can you climb to the top?
 * 
 *         Note: Given n will be a positive integer.
 * 
 *         Example 1:
 * 
 *         Input: 2 Output: 2 Explanation: There are two ways to climb to the top. 
 *         1. 1 step + 1 step 
 *         2. 2 steps
 * 
 *         Example 2:
 * 
 *         Input: 3 
 *         Output: 3 
 *         Explanation: There are three ways to climb to the top. 
 *         1. 1 step + 1 step + 1 step 
 *         2. 1 step + 2 steps 
 *         3. 2 steps + 1
 *         step
 *
 */

// its fibnocci series 
public class ClimbingStairs {

	int[] res = new int[100];

	public static void main(String[] args) {
		ClimbingStairs obj = new ClimbingStairs();
		System.out.println(obj.climbStairs(9));
	}

	public int climbStairs(int n) {
		if (n <= 3) {
			return n;
		}

		int index1 = 2;
		int index2 = 3;
		int sum = 0;
		for (int i = 4; i <= n; i++) {
			sum = index1 + index2;
			index1 = index2;
			index2 = sum;
		}

		return sum;
	}
}
