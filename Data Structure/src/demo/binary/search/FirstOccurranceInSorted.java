package demo.binary.search;

public class FirstOccurranceInSorted {

	public static void main(String[] args) {
		
		int arr[] = {2, 4, 10, 10, 10, 18, 20};//{5, 9, 11, 12, 12, 12, 15, 18, 19};
		int ele = 10;
		
		int firstIndex = binarySearch(arr, ele);
		System.out.println("First Occurrance is "+firstIndex);
	}

	private static int binarySearch(int[] arr, int ele) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		int firstOcc = -1;
		while(low <= high) {
			mid = low + (high - low)/2;
			
			if(arr[mid] == ele) {
				firstOcc = mid;
				high = mid - 1;
			}
			
			if(arr[mid] > ele)
				high = mid - 1;
			else if(arr[mid] < ele)
				low = mid + 1;
		}
		return firstOcc;
	}
}
