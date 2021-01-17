/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		
		int arr[] = {5, 8, 7, 1, 9, 5, 15};
		int n = arr.length;
		int t[] = new int[n];
		
		for(int i=0; i<n; i++)
			t[i] = 1;
		int max = 0;
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				
				if(arr[i] > arr[j] && t[i] <= t[j])
					t[i] = 1 + t[j];
				
				max = Math.max(max, t[i]);
			}
		}
		System.out.println(max);
	}
}
