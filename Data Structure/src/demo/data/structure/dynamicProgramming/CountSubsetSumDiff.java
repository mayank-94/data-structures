/**
 * 
 */
package demo.data.structure.dynamicProgramming;
/**
 * @author Mayank
 *
 */
//@SuppressWarnings("unused")
public class CountSubsetSumDiff {

	public static void main(String[] args) {
		
		int arr[] = {1, 1, 2, 3};
		int diff = 1;
		int n = arr.length;
		int sum = 0;
		for(int x : arr)
			sum += x;
		
		int s1 = (sum + diff) / 2;
		subSetSum(arr, n, s1);		
	}

	private static void subSetSum(int[] arr, int n, int sum) {
		
		int t[][] = new int[n+1][sum+1];
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(i == 0)
					t[i][j] = 0;
				if(j == 0)
					t[i][j] = 1;
			}
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
				if(arr[i-1] <= j)
					t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
				else
					t[i][j] = t[i-1][j];
			}
		}
		
		System.out.println(t[n][sum]);
	}
}
