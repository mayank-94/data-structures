package demo.data.structure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NearSmallerToLeftElement {

	public static void main(String[] args) {
		
		int arr[] = {4, 5, 2, 10, 8};
		int n = arr.length;
		int res[] = prevSmallerElement(arr, n);
		for (int i : res) {
			System.out.print(i+" ");
		}
	}

	private static int[] prevSmallerElement(int[] arr, int n) {
		Deque<Integer> stack = new ArrayDeque<>();
		int []result = new int[n];
		int top = 0;
		
		for(int i=0; i<n; i++) {
			if(stack.isEmpty())
				result[top] = -1;
			
			else if(arr[i] > stack.peek()){
				result[top] = stack.peek();
			}
			
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
