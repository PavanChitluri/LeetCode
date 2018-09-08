package com.strings;

public class NumberofLinesToWriteString {
	public static void main(String[] args) {
		NumberofLinesToWriteString obj = new NumberofLinesToWriteString();
		int[] widths = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10 };
		obj.numberOfLines(widths, "bbbcccdddaaa");
		
		
	}

	public int[] numberOfLines(int[] widths, String str) {
		int length = str.length();
		int count = 0;
		int lines = 0;
		for (int i = 0; i < length; i++) {
			int charAt = str.charAt(i) - 'a';
			count += widths[charAt];
			if (count > 100) {
				lines++;
				count = widths[charAt];
			}
		}
		if (count > 0) {
			lines++;
		}

		return new int[] { lines, count };
	}
}
