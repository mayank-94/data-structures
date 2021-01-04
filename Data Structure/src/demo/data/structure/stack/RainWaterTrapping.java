package demo.data.structure.stack;

public class RainWaterTrapping {

	public static void main(String[] args) {
		
		int arr[] = {8, 8, 2, 4, 5, 5, 1};//{3, 0, 0, 2, 0, 4};
		int n = arr.length;
		int maxL[] = new int[n];
		maxL[0] = arr[0];
		for(int i=1; i<n; i++)
			maxL[i] = Math.max(arr[i], maxL[i-1]);
		
		int maxR[] = new int[n];
		maxR[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--)
			maxR[i] = Math.max(arr[i], maxR[i+1]);
		
		int water[] = new int[n];
		for(int i=0; i<n; i++)
			water[i] = Math.min(maxL[i], maxR[i]) - arr[i];
		
		int sum = 0;
		for(int x : water)
			sum += x;
		
		System.out.println("Units of water trapped "+sum);
		
	}
}
