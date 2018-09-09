import java.util.ArrayList;
import java.util.List;

/*
 *  Write a program that outputs the string representation of numbers from 1 to n.
     But for multiples of three it should output “Fizz” instead of the number and for the 
     multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 */

public class FizzBuzz {
	public static void main(String[] args) {
		FizzBuzz obj = new FizzBuzz();
		List<String> list = obj.printString(30);
		System.out.println(list);
	}

	public List<String> printString(int n) {
		List<String> list = new ArrayList<>();
		if (n <= 0) {
			try {
				throw new Exception(" enter valid positive number ");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(new Integer(i).toString());
			}

		}
		return list;
	}

}
