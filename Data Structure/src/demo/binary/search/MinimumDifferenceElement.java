package demo.binary.search;

public class MinimumDifferenceElement {

	public static void main(String[] args) {
		
		int arr[] = {2, 8, 12, 16, 18};
		int ele = 15;
		int low = 0;
		int high = arr.length - 1;
		int minEle = -1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] == ele) {
				minEle = arr[mid];
				break;
			}
			
			if(arr[mid] < ele)
				low = mid + 1;
			else if(arr[mid] > ele)
				high = mid - 1;
		}
		
		minEle = Math.abs(ele - arr[low]) < Math.abs(ele - arr[high]) ? arr[low] : arr[high];
			
		System.out.println(minEle);
	}
}
