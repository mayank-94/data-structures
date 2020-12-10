/**
 * 
 */
package demo.sliding.window;

/**
 * @author Mayank
 *
 */
public class LongestSubarrayOfSumK {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,7,5};
		int k = 12;
		int n = arr.length, i = 0, j = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		while(j < n) {
			sum += arr[j];
			if(sum < k) {
				j++;
			}
			
			else if(sum == k) {
				if(j-i+1 > max)  //j-i+1 = window size
					max = j-i+1;
				j++;
			}
			
			else if(sum > k) {
				while(sum > k) {
					sum -= arr[i];
					i++;
				}
				if(sum == k) {
					if(j-i+1 > max)  //j-i+1 = window size
						max = j-i+1;
					j++;
				}else {
					j++;
				}
			}
		}
		System.out.println(max);
	}
}
