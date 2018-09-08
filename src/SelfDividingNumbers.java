import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	public static void main(String[] args) {
		SelfDividingNumbers obj = new SelfDividingNumbers();
		System.out.println(obj.selfDividingNumbers(1, 22));
	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		while (left <= right) {
			int num = left;
			while (num >= 1) {
				int div = num % 10;
				if (div == 0) {
					break;
				}
				if (left % div != 0) {
					break;
				}
				num = num / 10;
			}
			if (num == 0) {
				list.add(left);
			}
			left++;
		}

		return list;
	}

	public List<Integer> selfDividingNumbers2(int left, int right) {
		List<Integer> al = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if (self(i)) {
				al.add(i);
			}
		}
		return al;
	}

	public boolean self(int i) {
		int n = 0;
		int num = i;
		while (num != 0) {
			n = num % 10;
			if (n == 0) {
				return false;
			}
			if (i % n != 0) {
				return false;
			}
			num = num / 10;
		}
		return true;
	}

}
