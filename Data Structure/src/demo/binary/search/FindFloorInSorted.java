/**
 * 
 */
package demo.binary.search;

/**
 * @author Mayank
 *
 */
public class FindFloorInSorted {

	public static void main(String[] args) {
		
		int arr[] = {2, 3, 4, 8, 10, 15, 18};
		int ele = 5;
		int low = 0;
		int high = arr.length - 1;
		int floor = -1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == ele) {
				floor = mid;
				break;
			}
			
			if(arr[mid] > ele)
				high = mid - 1;
			else if(arr[mid] < ele) {
				floor = arr[mid];
				low = mid + 1;
			}
		}
		
		System.out.println(floor);
	}
}
