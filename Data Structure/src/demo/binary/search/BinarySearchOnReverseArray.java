package demo.binary.search;

public class BinarySearchOnReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {20, 18, 17, 14, 11, 10, 6, 4, 1};
		int ele = 4;
		int index = searchElement(arr, ele);
		System.out.println("Index is "+index);
	}

	private static int searchElement(int[] arr, int ele) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		while(low < high) {
			mid = low + (high-low) / 2;
			
			if(arr[mid] == ele)
				break;
			
			else if(arr[mid] > ele)
				low = mid + 1;
			else if(arr[mid] < ele)
				high = mid - 1;
		}
		return mid;
	}
}
