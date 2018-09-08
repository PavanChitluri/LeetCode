import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {

	public static void main(String[] args) {
		
		
	}
	
	public int getMoreCode (String[]  words) {
		String[] morseCharString = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		Set<String> set = new HashSet<>();
		for (String word : words) {
			char[] charArray = word.toCharArray();
			int length = charArray.length;
			StringBuilder st = new StringBuilder();
			for (int i = 0; i < length; i++) {
				st.append(morseCharString[charArray[i] - 97]);
			}
			set.add(st.toString());
		}
		
		
		
		return set.size();
	}
	
	
}
