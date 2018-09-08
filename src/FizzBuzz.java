import java.util.ArrayList;
import java.util.List;

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
		
		for( int i=1 ; i<=n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 3 == 0) {
				list.add("Buzz");
			} else {
				list.add(new Integer(i).toString());
			}
			
		}
		return list;
	}

}
