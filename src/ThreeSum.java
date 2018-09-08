import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public static void main(String[] args) {
		ThreeSum obj = new ThreeSum();
		int nums[] = { -1, 0, 1, 2, -1, -4 };
		obj.threeSum(nums);

	}

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null) {
			return null;
		}
		if (nums.length < 3) {
			return null;
		}
		List<List<Integer>> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		Arrays.sort(nums);
		int k = nums.length - 1;
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] > 0) {
				break;
			}

			int j = i + 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				System.out.println(sum);
				if (sum == 0) {

					if (set.contains(nums[i]) && set.contains(nums[j]) && set.contains(nums[k])) {

					} else {
						set.add(nums[i]);
						set.add(nums[j]);
						set.add(nums[k]);
						List<Integer> numsList = new ArrayList();
						numsList.add(nums[i]);
						numsList.add(nums[j]);
						numsList.add(nums[k]);
						list.add(numsList);
					}
					j++;
					k--;
				} else if (sum > 0) {
					k--;
				} else {
					j++;
				}
			}

		}
		System.out.println(list);
		return list;
	}

	public List<List<Integer>> threeSum2(int[] nums) {
		if (nums == null) {
			return null;
		}
		if (nums.length < 3) {
			return null;
		}
		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> numsList = new ArrayList();
						numsList.add(nums[i]);
						numsList.add(nums[j]);
						numsList.add(nums[k]);
						list.add(numsList);

					}
				}

			}
		}

		return list;
	}
}
