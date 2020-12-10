package demo.data.structure.arrays;

public class RearrangeMaxMin {

	public static void main(String[] args) {
		
		int arr[] = {1969, 2677, 3142, 4631, 4764, 5748, 6476, 6487};
		int n = arr.length;
		int minIdx = 0, maxIdx = n-1;
		int maxEle = arr[n-1] + 1;
		
		for(int i=0; i<n; i++) {
			if(i%2 == 0) {
				arr[i] += (arr[maxIdx] % maxEle) * maxEle;
				maxIdx--;
			}else {
				arr[i] += (arr[minIdx] % maxEle) * maxEle;
				minIdx++;
			}
		}
		
		for(int i=0; i<n; i++)
			arr[i] = arr[i]/maxEle;
		
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
}
