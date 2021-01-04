package demo.data.structure.stack;

import java.util.ArrayDeque;

public class HistograMaxArea {

	public static void main(String[] args) {
		
		int arr[] = {1, 1};//{2, 1, 5, 6, 2, 3};
		int n = arr.length;
		int []nslIndex = new int[n];
		int []nsrIndex = new int[n];
		
		nslIndex = findNSL(arr, n, nslIndex);
		nsrIndex = findNSR(arr, n, nsrIndex);
		
//		for(int x : nslIndex)
//			System.out.print(x+" ");
//		
//		System.out.println();
		
		int width[] = new int[n];
		for(int i=0; i<n; i++)
			width[i] = Math.abs(nslIndex[i] - nsrIndex[i]) - 1;
		
		int area[] = new int[n];
		for(int i=0; i<n; i++)
			area[i] = width[i] * arr[i];
		
//		for(int x : area)
//			System.out.print(x+" ");
//		
//		System.out.println();
		
		int maxArea = area[0];
		for(int i=1; i<n; i++)
			maxArea = Math.max(maxArea, area[i]);
		
		System.out.println("Maximum Area is "+maxArea);
	}

	private static int[] findNSR(int[] arr, int n, int[] nsrIndex) {
		int top = 0;
		ArrayDeque<Pair2> stack = new ArrayDeque<>();
		for(int i = n-1; i>=0; i--) {
			if(stack.isEmpty())
				nsrIndex[top] = n;
			else if(arr[i] >= stack.peek().value)
				nsrIndex[top] = stack.peek().index;
			else {
				while(!stack.isEmpty() && arr[i] <= stack.peek().value)
					stack.poll();
				
				if(stack.isEmpty())
					nsrIndex[top] = n;
				else
					nsrIndex[top] = stack.peek().index;
			}
			
			top++;
			stack.push(new Pair2(i, arr[i]));
		}
		for(int i=0; i<n/2; i++) {
			int temp = nsrIndex[i];
			nsrIndex[i] = nsrIndex[n-1-i];
			nsrIndex[n-1-i] = temp;
		}
		return nsrIndex;
	}

	private static int[] findNSL(int[] arr, int n, int[] nslIndex) {
		int top = 0;
		ArrayDeque<Pair2> stack = new ArrayDeque<>();
		for(int i = 0; i<n; i++) {
			if(stack.isEmpty())
				nslIndex[top] = -1;
			else if(arr[i] > stack.peek().value)
				nslIndex[top] = stack.peek().index;
			else {
				while(!stack.isEmpty() && arr[i] <= stack.peek().value)
					stack.poll();
				
				if(stack.isEmpty())
					nslIndex[top] = -1;
				else
					nslIndex[top] = stack.peek().index;
			}
			
			top++;
			stack.push(new Pair2(i, arr[i]));
		}
		return nslIndex;
	}
}

class Pair2{
	int index;
	int value;
	
	public Pair2(int index, int value) {
		this.index = index;
		this.value = value;
	}
}
