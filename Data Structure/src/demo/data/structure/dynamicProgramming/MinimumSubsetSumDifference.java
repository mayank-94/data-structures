/**
 * 
 */
package demo.data.structure.dynamicProgramming;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Mayank
 *
 */
public class MinimumSubsetSumDifference {

	public static void main(String[] args) {
		
		int arr[] = {1, 5, 5, 12};
		int n = arr.length;
		int sum = 0;
		for(int x : arr)
			sum += x;
		
		subsetSum(arr, n, sum);
	}

	private static void subsetSum(int[] arr, int n, int sum) {
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
					t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
				
				else
					t[i][j] = t[i-1][j];
			}
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<sum+1; i++)
			if(t[n][i] == true)
				list.add(i);
		
		System.out.println(list);
		int min = Integer.MAX_VALUE;
		for(int i=0; i<list.size(); i++)
			min = Math.min(min, Math.abs(sum - 2*list.get(i)));
		
		System.out.println(min);
	}
}
