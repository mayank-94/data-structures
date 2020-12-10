/**
 * 
 */
package demo.sliding.window;

/**
 * @author Mayank
 *
 */
public class MaxSumSubArrayOfK {

	public static void main(String[] args) {
		
		int arr[] = {-1, -2, 4, 8, -5, -1, 10};
		int n = arr.length;
		int k = 3;
		int sum = 0, windowSum = 0;
		
		for(int i=0; i<k; i++)
			sum+=arr[i];
		
		windowSum = sum;
		for(int i=k; i<n; i++) {
			sum = sum + arr[i] - arr[i-k];
			
			windowSum = Math.max(sum, windowSum);
		}
		
		System.out.println(windowSum);
	}
}
