/**
 * 
 */
package demo.data.structure.dynamicProgramming;


/**
 * @author Mayank
 *
 */
public class Knapsack_0_1 {
	
	public static void main(String[] args) {
		
		int wt[] = {1, 3, 4, 8};
		int val[] = {1, 4, 5, 7};
		int W = 7;
		int n = wt.length;
		int t[][] = new int[n+1][W+1];
		//Arrays.fill(t, -1);
		
		int max = knapsack(wt, val, n, W, t);
		System.out.println(max);
	}

	private static int knapsack(int[] wt, int[] val, int n, int W, int[][]t) {
		if(n == 0 || W == 0)
			return 0;
		
		if(t[n][W] != 0)
			return t[n][W];
		
		if(wt[n-1] <= W) 
			return t[n][W] = Math.max(val[n-1] + knapsack(wt, val, n - 1, W - wt[n-1], t),
					knapsack(wt, val, n - 1, W, t));
		
		else
			return t[n][W] = knapsack(wt, val, n - 1, W, t);
		
	}
}
