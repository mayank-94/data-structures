package demo.data.structure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreaterElement {

	public static void main(String[] args) {
		
		int arr[] = {8, 5, 7, 4, 3, 6};
		int n = arr.length;
		int res[] = previousGreaterElement(arr, n);
		for (int i : res) {
			System.out.print(i+" ");
		}
	}

	private static int[] previousGreaterElement(int[] arr, int n) {
		Deque<Integer> stack = new ArrayDeque<>();
		int []result = new int[n];
		int top = 0;
		
		for(int i=0; i<n; i++) {
			if(stack.isEmpty()) 
				result[top] = -1;
			
			else if(arr[i] < stack.peek())
				result[top] = stack.peek();
			
			else {
				while(!stack.isEmpty() && arr[i] > stack.peek()) {
					stack.pop();
				}
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
