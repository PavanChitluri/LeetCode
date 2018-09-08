import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		TwoSumTarget obj = new TwoSumTarget();
		int[] twoSum = obj.twoSum(nums, 9);
		System.out.print("[" + twoSum[0] + " " + twoSum[1] + "]");

	}

	public int[] twoSum(int[] nums, int target) {
		int[] elements = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		int arrLength = nums.length;
		for (int i = 0; i < arrLength; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { nums[i], complement };
			}
			map.put(nums[i], i);
		}

		return elements;
	}
}
