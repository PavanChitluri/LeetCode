
public class ExcelSheetColumn {

	public static void main(String[] args) {
		ExcelSheetColumn obj = new ExcelSheetColumn();
		int count = obj.getCountByColumn("ZY");
		System.out.println(count);
	}

	public int getCountByColumn(String column) {

		int length = column.length();
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum = (sum * 26) + column.charAt(i) - 64;
		}

		return sum;
	}

}
