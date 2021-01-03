package demo.data.structure.arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		
		int arr[] = {2, 5, 4, 1, 6, 5};
		int equilibrium = findEquilibrium(arr);
		System.out.println(equilibrium);
	}

	private static int findEquilibrium(int[] arr) {
		int leftSum = 0;
		for(int x : arr)
			leftSum += x;
		
		int rightSum = 0;
		for(int i=0; i<arr.length; i++) {
			leftSum -= arr[i];
			
			if(leftSum == rightSum)
				return arr[i];
			
			rightSum += arr[i];
		}
		return -1;
	}
}
