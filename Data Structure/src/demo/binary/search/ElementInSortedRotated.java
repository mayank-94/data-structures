package demo.binary.search;

public class ElementInSortedRotated {

	public static void main(String[] args) {
		
		int arr[] = {11, 12, 15, 18, 19, 2, 5, 6, 8};
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
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			int next = (mid + 1) % N;
			int prev = (mid - 1 + N) % N;
			
			if(arr[mid] <= arr[prev] && arr[mid] <= arr[next])
				return mid;
			
			if(arr[low] < arr[mid]) // left side is sorted
				low = mid;
			else if(arr[mid] < arr[high]) // right side is sorted
				high = mid;
		}
		return -1;
	}
}
