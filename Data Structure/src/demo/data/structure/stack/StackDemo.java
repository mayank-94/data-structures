/**
 * 
 */
package demo.data.structure.stack;

/**
 * @author Mayank
 *
 */
public class StackDemo {
	
	private final int MAX = 2;
	private int []stack = new int[MAX];
	private int top = -1;
	
	void push(int value) {
		if(top >= MAX-1) {
			System.out.println("Overflow");
			return;
		}
		stack[++top] = value;
		System.out.println(value +" pushed into stack");
	}
	
	void pop() {
		if(top < 0) {
			System.out.println("Underflow");
			return;
		}
		
		int value = stack[top];
		top--;
		System.out.println(value+" popped out of stack");
	}
	
	public static void main(String[] args) {
		
		StackDemo stack = new StackDemo();
		stack.push(2);
		stack.push(8);
		stack.push(7);
		stack.pop();
		stack.pop();
		//stack.pop();
	}
}
