/**
 * 
 */
package demo.data.structure.recursion;

import java.util.Stack;
/**
 * @author Mayank
 *
 */
public class SortStack {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(3);
		stack.push(9);
		stack.push(1);
		System.out.println(stack);
		sort(stack);
		System.out.println(stack);
	}

	private static void sort(Stack<Integer> stack) {
		if(stack.size() == 1)
			return;
		
		int k = stack.pop();
		sort(stack);
		insert(stack, k);
	}

	private static void insert(Stack<Integer> stack, int k) {
		if(stack.size() == 0 || stack.peek() < k) {
			stack.push(k);
			return;
		}
		
		int temp = stack.pop();
		insert(stack, k);
		stack.push(temp);
	}

}
