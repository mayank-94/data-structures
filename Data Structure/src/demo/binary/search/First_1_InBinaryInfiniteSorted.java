/**
 * 
 */
package demo.binary.search;

/**
 * @author Mayank
 *
 */
public class First_1_InBinaryInfiniteSorted {

	public static void main(String[] args) {
		
		int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
		int ele = 1;
		int low = 0;
		int high = 1;
		
		while(ele > arr[high]) {
			low = high;
			high = high * 2;
		}
		
		int index = firstOccurrence(arr, low, high, ele);
		System.out.println("First occurrence is "+index);
	}

	private static int firstOccurrence(int[] arr, int low, int high, int ele) {
		int index = -1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == ele) {
				index = mid;
				high = mid - 1;
			}
			
			if(arr[mid] < ele)
				low = mid + 1;
			else if(arr[mid] > ele)
				high = mid - 1;
		}
		return index;
	}
}
