class Knapsack
{

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static int knapSack(int W, int wt[], int val[], int n) {
		if (n == 0 || W == 0)
			return 0;

		if (wt[n - 1] > W)
			return knapSack(W, wt, val, n - 1);

		else
			return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
	}

	public static void main(String args[]) {
		// int val[] = new int[] { 29, 74, 16, 55, 52, 75, 74, 35, 78};
		// int wt[] = new int[] { 85, 14, 4, 26, 63, 76, 60, 93, 89 };

		int val[] = new int[] { 45, 98, 3, 76, 9, 48 };
		int wt[] = new int[] { 53, 88, 78, 72, 30, 46 };

		int W = 75;
		int n = val.length;
		int maxValue = knapSack(W, wt, val, n);
		int value = maxValue;
		System.out.println(maxValue);
		int i=0;
		int temp=0;
		while (maxValue > 0 || i >0 ) {
			for ( ; temp < val.length; temp++) {
				System.out.println(" in for ");
				maxValue = maxValue - val[temp];
				if (maxValue == 0) {
					System.out.print("fuck");
				} 
				
				if( maxValue < 0 ) {
					maxValue = value;
					i++;
					temp++;
				}
			}
		}
	}
}