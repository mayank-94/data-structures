package demo.data.structure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NearSmallerToRight {

	public static void main(String[] args) {
		
		int arr[] = {4, 5, 2, 10, 8};
		int n = arr.length;
		int res[] = nextSmallerElement(arr, n);
		for(int i = n-1; i>=0; i--)
			System.out.print(res[i]+" ");

	}

	private static int[] nextSmallerElement(int[] arr, int n) {
		Deque<Integer> stack = new ArrayDeque<>();
		int []result = new int[n];
		int top = 0;
		for(int i=n-1; i>=0; i--) {
			if(stack.isEmpty())
				result[top] = -1;
			
			else if(arr[i] > stack.peek())
				result[top] = stack.peek();
			
			else {
				while(!stack.isEmpty() && arr[i] < stack.peek())
					stack.pop();
				
				if(stack.isEmpty())
					result[top] = -1;
				
				else
					result[top] = stack.peek();	
			}
			
			top++;
			stack.push(arr[i]);
		}
		return result;
	}

}
