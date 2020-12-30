/**
 * 
 */
package demo.binary.search;

/**
 * @author Mayank
 *
 */
public class RotationsInSortedArray {

	public static void main(String[] args) {
		
		int arr[] = {8, 10, 11, 18, 2, 4, 5, 7};
		int N = arr.length;
		int rotations = findRotations(arr, N);
		System.out.println("Number of Rotations are "+rotations);
	}

	private static int findRotations(int[] arr, int N) {
		int low = 0;
		int high = N - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			int next = (mid + 1) % N; // we did modular so that if mid is 7th index, it's next will be 0th index
			int prev = (mid + N - 1) % N; // we added N because if mid is 0th index, modular on (0-1) will give incorrect result
			
			if(arr[mid] < arr[next] && arr[mid] < arr[prev])
				return N - mid;
			
			if(arr[low] < arr[mid])
				low = mid;
			else if(arr[mid] < arr[high])
				high = mid;
		}
		return 0;
	}
}
