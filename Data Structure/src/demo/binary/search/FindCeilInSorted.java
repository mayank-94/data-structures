/**
 * 
 */
package demo.binary.search;

/**
 * @author Mayank
 *
 */
public class FindCeilInSorted {

	public static void main(String[] args) {
		
		int arr[] = {2, 3, 4, 7, 8, 10, 15, 18};
		int ele = 14;
		int low = 0;
		int high = arr.length - 1;
		int ceil = -1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == ele) {
				ceil = arr[mid];
				break;
			}
			
			if(arr[mid] < ele)
				low = mid + 1;
			else if(arr[mid] > ele) {
				ceil = arr[mid];
				high = mid - 1;
			}
		}
		
		System.out.println(ceil);
	}
}
