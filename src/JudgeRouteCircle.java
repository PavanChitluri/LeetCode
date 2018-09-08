
public class JudgeRouteCircle {
	public static void main(String[] args) {
		JudgeRouteCircle obj = new JudgeRouteCircle();
		System.out.println(obj.judgeCircle("UD"));

	}

	public boolean judgeCircle(String moves) {
		int hash[] = new int[26];
		for (char c : moves.toCharArray()) {
			++hash[c - 'A'];
		}
		return (hash['L' - 'A'] == hash['R' - 'A'] && hash['D' - 'A'] == hash['U' - 'A']);
	}

	public boolean judgeCircle1(String moves) {
		if (moves == null) {
			return true;
		}
		if (moves.length() < 1) {
			return true;
		}

		int hor = 0, ver = 0;
		for (int i = 0; i < moves.length(); i++) {
			switch (moves.charAt(i)) {
			case 'U':
				ver++;
				break;
			case 'D':
				ver--;
				break;

			case 'L':
				hor--;
				break;

			case 'R':
				hor++;
				break;

			}
		}

		return (hor == 0) && (ver == 0);
	}
}
