/**
 * 
 */
package demo.data.structure.recursion;

import java.util.Stack;

/**
 * @author Mayank
 *
 */
public class DeleteMiddleElementInStack {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		stack.push(1);
		
		int k = stack.size()/2 + 1;
		deleteMiddle(stack, k);
		
		System.out.println(stack);
	}

	private static void deleteMiddle(Stack<Integer> stack, int k) {
		if(k == 1) {
			stack.pop();
			return;
		}
		
		int temp = stack.pop();
		deleteMiddle(stack, k-1);
		stack.push(temp);
	}
}
