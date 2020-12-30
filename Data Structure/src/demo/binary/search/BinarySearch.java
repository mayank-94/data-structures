package demo.binary.search;

public class BinarySearch {

	public static void main(String[] args) {
		
		int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int ele = 2;
		int index = binarySearch(arr, ele);
		System.out.println("Index of element is "+index);
	}

	private static int binarySearch(int[] arr, int ele) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		while(low < high) {
			mid = low + (high - low)/2;
			
			if(arr[mid] == ele)
				break;
			
			if(arr[mid] > ele)
				high = mid - 1;
			
			else if(arr[mid] < ele)
				low = mid + 1;
		}
		return mid;
	}
}
