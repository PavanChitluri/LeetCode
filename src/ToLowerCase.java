
public class ToLowerCase {
	public static void main(String[] args) {
		ToLowerCase obj = new ToLowerCase();
		String lowerCase = obj.toLowerCase("Pavan Kumar Chitluri ");
		System.out.println(lowerCase);
	}
	
	public String toLowerCase(String input) {
		char[] charArray = input.toCharArray();
		int length = input.length();
		for (int i = 0; i < length; i++) {
			if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
				charArray[i] += 32;
			}
		}
		return new String(charArray);
	}
}
