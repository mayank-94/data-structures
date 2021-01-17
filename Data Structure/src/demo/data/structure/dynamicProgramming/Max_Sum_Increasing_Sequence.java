/**
 * 
 */
package demo.data.structure.dynamicProgramming;

/**
 * @author Mayank
 *
 */
public class Max_Sum_Increasing_Sequence {

	public static void main(String[] args) {
		
		int arr[] = {7, 1, 4, 8, 11, 2, 14, 3};
		int n = arr.length;
		int t[] = new int[n];
		
		for(int i=0; i<n; i++)
			t[i] = arr[i];
		int max = 0;
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				
				if(arr[i] > arr[j] && arr[i] + t[j] > t[i]) {
					t[i] = arr[i] + t[j];
				}
				
				max = Math.max(max, t[i]);
			}
		}
		
		System.out.println(max);
	}
}
