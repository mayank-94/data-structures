package demo.data.structure.stack;

import java.util.Stack;

class StackOperations{
	
	Stack<Integer> s = new Stack<>();
	int minEle;
	
	int getMin() {
		if(s.isEmpty())
			return -1;
		
		return minEle;
	}
	
	void push(int x) {
		if(s.isEmpty()) {
			minEle = x;
			s.push(x);
		}
		
		else if(x > minEle)
			s.push(x);
		
		else {
			s.push(2*x - minEle);
			minEle = x;
		}
	}
	
	int pop() {
		if(s.isEmpty())
			return -1;
		
		int x = s.pop();
		if(x > minEle)
			return x;
		
		else {
			int y = minEle;
			minEle = 2*minEle - x;
			return y;
		}
	}
	
}

public class MinimumElementInStack {

	public static void main(String[] args) {
		
		StackOperations stack = new StackOperations();
		stack.push(8);
		stack.push(10);
		System.out.println(stack.getMin());
		stack.push(6);
		System.out.println(stack.getMin());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());

	}

}
