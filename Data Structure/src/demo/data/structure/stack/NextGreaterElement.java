/**
 * 
 */
package demo.data.structure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Mayank
 *
 */
public class NextGreaterElement {

	public static void main(String[] args) {
		
		int arr[] = {1, 3, 2, 4};
		int n = arr.length;
		
		int result[] = getNextGreaterElements(arr, n);
		for(int i = n-1; i>=0; i--)
			System.out.print(result[i]+" ");
	}

	private static int [] getNextGreaterElements(int[] arr, int n) {
		Deque<Integer> stack = new ArrayDeque<>();
		int[] result = new int[n];
		int top = 0;
		
		for(int i=n-1; i>=0; i--) {
			if(stack.isEmpty()) {
				result[top] = -1;
			}
			
			else if(stack.peek() > arr[i]) {
				result[top] = stack.peek();
			}
			
			else {
				 while(!stack.isEmpty() && stack.peek() < arr[i]) {
					 stack.pop();
				 }
				 if(stack.isEmpty()) {
					 result[top] = -1;
				 }else {
					 result[top] = stack.peek();
				 }
			}
			 top++;
			 stack.push(arr[i]);
		}
		return result;		
	}

}
