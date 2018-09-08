import java.util.Arrays;

public class MajorityElement {
	public static void main(String[] args) {
		
	}
	
	public int getElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	
	
	public int majorityElement(int[] nums) {
		int majorElement = nums[0];
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (count == 0) {
				majorElement = nums[i];
				count++;
			} else if (majorElement == nums[i]) {
				count++;
			} else
				count--;
		}
		return majorElement;
	}
}
