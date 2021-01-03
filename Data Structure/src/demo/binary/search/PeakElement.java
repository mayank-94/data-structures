/**
 * 
 */
package demo.binary.search;

/**
 * @author Mayank
 *
 */
public class PeakElement {

	public static void main(String[] args) {
		
		int arr[] = {5, 10, 20, 15, 18, 25, 30, 28};
		int low = 0;
		int high = arr.length - 1;
		int peak = -1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(mid > 0 && mid < arr.length - 1) // so that mid is not at 0th and last index
			{
				if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
					peak = arr[mid];
					break;
				}
				if(arr[mid-1] > arr[mid])  //possible direction, as arr[mid+1] is smaller that arr[mid]
					high = mid-1;
				else if(arr[mid+1] > arr[mid])
					low = mid+1;
			}
			
			else if(mid == 0)
			{
				if(arr[0] > arr[1])
					peak = arr[0];
				else
					peak = arr[1];
				
				break;
			}
			
			else if(mid == arr.length - 1)
			{
				if(arr[mid] > arr[mid - 1])
					peak = arr[mid];
				else
					peak = arr[mid - 1];
				
				break;
			}
		}
		
		System.out.println(peak);
	}
}
