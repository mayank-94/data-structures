/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class EqualSumPartition {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 6, 3, 4};
		int sum = 0;
		for(int x : arr)
			sum += x;
		if(sum % 2 != 0) {
			System.out.println(false);
			return;
		}
		
		int n = arr.length;
		
		boolean result = equalSumPartition(arr, sum/2, n);
		System.out.println(result);
	}

	private static boolean equalSumPartition(int[] arr, int sum, int n) {
		
		boolean t[][] = new boolean[n+1][sum+1];
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(i == 0)
					t[i][j] = false;
				if(j == 0)
					t[i][j] = true;
			}
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
				if(arr[i-1] <= j)
					t[i][j] = t[i-1][j - arr[i-1]] || t[i-1][sum];
				else
					t[i][j] = t[i-1][sum];
			}
		}
		return t[n][sum];
	}
}
