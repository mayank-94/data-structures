package demo.binary.search;

public class ElementInSortedRotated {

	public static void main(String[] args) {
		
		int arr[] = {11, 12, 15, 18, 2, 5, 6};
		int N = arr.length;
		int minEleIndex = findMinIndex(arr, N);
		System.out.println("Index of Minimum element is "+minEleIndex);
		int ele = 11;
		int index1 = findElement(arr, 0, minEleIndex - 1, ele);
		int index2 = findElement(arr, minEleIndex, N - 1, ele);
		if(index1 == -1)
			System.out.println(index2);
		else
			System.out.println(index1);
	}

	

	private static int findElement(int[] arr, int i, int j, int ele) {
		int low = i;
		int high = j;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == ele)
				return mid;
			
			if(arr[mid] > ele)
				high = mid - 1;
			else if(arr[mid] < ele)
				low = mid + 1;
				
		}
		return -1;
	}



	private static int findMinIndex(int[] arr, int N) {
		int low = 0;
		int high = N - 1;
		
		if(arr[low] < arr[high])
			return low;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] > arr[mid + 1])
				return mid + 1;
			if(arr[mid] < arr[mid - 1])
				return mid;
			
			if(arr[mid] > arr[low])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
}
