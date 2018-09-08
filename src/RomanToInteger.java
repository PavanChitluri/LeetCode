import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static void main(String[] args) {

		RomanToInteger obj = new RomanToInteger();
		int value = obj.getValue("IV");
		System.out.println(value);

	}

	public int getValue(String romanValue) {

		if (romanValue == null) {
			return 0;
		}
		int length = romanValue.length();
		if (length == 0) {
			return 0;
		}
		char[] array = romanValue.toCharArray();
		int sum = 0;
		Map<Character, Integer> map = new HashMap();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		for (int i = 0; i < length; i++) {
			if (i == length - 1) {
				sum = sum + map.get(array[i]);
				return sum;
			}
			int curr = map.get(array[i]);
			int next = map.get(array[i + 1]);
			if (curr < next) {
				sum -= curr;
			} else {
				sum += curr;
			}

		}

		return sum;
	}
	
	
	
	public int romanToInt(String s) {
        int[] values = new int[s.length()];
        for(int i = 0; i<s.length(); i++){
            switch(s.charAt(i)){
                case 'I':
                    values[i] = 1;
                    break;
                case 'V':
                    values[i] = 5;
                    break;
                case 'X':
                    values[i] = 10;
                    break;
                case 'L':
                    values[i] = 50;
                    break;
                case 'C':
                    values[i] = 100;
                    break;
                case 'D':
                    values[i] = 500;
                    break;
                case 'M':
                    values[i] = 1000;
                    break;
            }
        }
        int sum = 0;
        for(int i = 0; i<values.length; i++){
            if(i < values.length - 1 && values[i] < values[i+1]) sum -= values[i];
            else sum  += values[i];
        }
        return sum;
    }
	
	
	// without using map
	/*public int getValue(String romanValue) {

		if (romanValue == null) {
			return 0;
		}
		int length = romanValue.length();
		if (length == 0) {
			return 0;
		}
		int sum = 0;

		for (int i = 0; i < length; i++) {
			if (i == length - 1) {
				sum = sum + getValue(romanValue.charAt(i));
				return sum;
			}
			int curr = getValue(romanValue.charAt(i));
			int next = getValue(romanValue.charAt(i + 1));
			if (curr < next) {
				sum += (next - curr);
				i++;
			} else {
				sum += curr;
			}

		}

		return sum;
	}*/

	public int getValue(Character c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;

		}
	}

}
