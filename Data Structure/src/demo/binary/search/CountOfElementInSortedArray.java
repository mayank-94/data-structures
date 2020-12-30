package demo.binary.search;

public class CountOfElementInSortedArray {

	public static void main(String[] args) {
		
		int []arr = {2, 5, 9, 10, 10, 12, 14};
		int ele = 10;
		int firstOcc = firstOccurrence(arr, ele);
		int lastOcc = lastOccurrence(arr, ele);
		System.out.println("Count is "+(lastOcc - firstOcc + 1));
		
	}

	private static int lastOccurrence(int[] arr, int ele) {
		int low = 0;
		int high = arr.length - 1;
		int last = 0;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == ele) {
				last = mid;
				low = mid + 1;
			}
			if(arr[mid] > ele)
				high = mid - 1;
			else if(arr[mid] < ele)
				low = mid + 1;
		}
		return last;
	}

	private static int firstOccurrence(int[] arr, int ele) {
		int low = 0;
		int high = arr.length - 1;
		int first = 0;
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == ele) {
				first = mid;
				high = mid - 1;
			}
			else if(arr[mid] > ele)
				high = mid - 1;
			else if(arr[mid] < ele)
				low = mid + 1;
		}
		return first;
	}
}
