import java.util.Spliterator;

public class Test {
	public static void main(String[] args) {
		String line= "81 : (1,53.38,$45) (2,88.62,$98) (3,78.48,$3) (4,72.30,$76) (5,30.18,$9) (6,46.34,$48)";
		
		String[] split = line.split(":");
		System.out.println(split[0]);
//		System.out.println(split[1]);
		String s2 = split[1];
		String replace = s2.replace('$', ' ');
//		System.out.println(replace);
		
		String replace2 = replace.replace('(', ',');
//		System.out.println(replace2);
		String replace3 = replace2.replace(')', ' ');
//		System.out.println(replace3);
		String replace4 = replace3.replaceFirst(",", "");
		System.out.println(replace4);
		String[] split2 = replace4.split(",");
		int length = split2.length;
		int i =0;
		String[] data = new String[length];
		for (String string : split2) {
//			System.out.print(string.trim()+" ");
			data[i++] = string.trim();
		}
		System.out.println("total length "+length);
		int arrayLength =  (length+1)/3;
		System.out.println(arrayLength);
		int[] index = new int[arrayLength];
		i =0;
		for (int j = 0; j < length; j=j+3) {
//			System.out.println("j "+j);
			index[i++] = Integer.parseInt(data[j]);
		}

		for (int j : index) {
			System.out.print(" index-"+j);
		}
		
		double[] weight = new double[arrayLength];
		i =0;
		for (int j = 1; j < length; j=j+3) {
//			System.out.println("j "+j);
			weight[i++] = Double.parseDouble(data[j]);
		}
		System.out.println();
		for (double j : weight) {
			System.out.print(" weight-"+j);
		}
		
		int[] cost = new int[arrayLength];
		i =0;
		for (int j = 2; j < length; j=j+3) {
//			System.out.println("j "+j);
			cost[i++] = Integer.parseInt(data[j]);
		}
		System.out.println();
		for (int j : cost) {
			System.out.print(" cost-"+j);
		}
	}
}
