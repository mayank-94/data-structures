/**
 * 
 */
package demo.binary.search;

/**
 * @author Mayank
 *
 */
public class SearchInNearlySorted {

	public static void main(String[] args) {
		
		int arr[] = {8, 15, 10, 20, 30, 38, 44, 52, 58, 65};
		int ele = 10;
		int index = findElement(arr, ele);
		System.out.println(index);
	}

	private static int findElement(int[] arr, int ele) {
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == ele)
				return mid;
			if(mid - 1 > 0 && arr[mid - 1] == ele)
				return mid - 1;
			if(mid + 1 < arr.length - 1 && arr[mid + 1] == ele)
				return mid + 1;
			
			if(arr[mid] > ele)
				high = mid - 2;
			else if(arr[mid] < ele)
				low = mid + 2;
		}
		return 0;
	}
}
