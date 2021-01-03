/**
 * 
 */
package demo.binary.search;

/**
 * @author Mayank
 *
 */
public class MinimumPages {

	public static void main(String[] args) {
		
		int arr[] = new int[] {10, 20, 30, 40};
		int k = 2;
		int max = arr[0];
		for(int i = 1; i< arr.length; i++)
			max = Math.max(max, arr[i]);
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++)
			sum += arr[i];
		
		int start = max, end = sum;
		int res = -1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(isValid(arr, k, arr.length, mid)) {
				res = mid;
				end = mid - 1;
			}else start = mid + 1;
		}
		
		System.out.println("Minimum pages required "+res);
	}

	private static boolean isValid(int[] arr, int k, int length, int mid) {
		int student = 1;
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
			
			if(sum > mid) {
				student++;
				sum = arr[i];
			}
			
			if(student > k)
				return false;
		}
		return true;
	}
}
