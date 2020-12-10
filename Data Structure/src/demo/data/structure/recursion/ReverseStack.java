package demo.data.structure.recursion;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		stack.push(1);
		
		System.out.println(stack);
		reverse(stack);
		System.out.println(stack);
	}

	private static void reverse(Stack<Integer> stack) {
		if(stack.size() == 1)
			return;
		
		int k = stack.pop();
		reverse(stack);
		insert(stack, k);
	}
	
	private static void insert(Stack<Integer> stack, int k) {
		if(stack.size() == 0) {
			stack.push(k);
			return;
		}
		
		int temp = stack.pop();
		insert(stack, k);
		stack.push(temp);
	}
}
