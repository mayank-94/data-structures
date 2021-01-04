/**
 * 
 */
package demo.data.structure.stack;

import java.util.ArrayDeque;

/**
 * @author Mayank
 *
 */
class Pair{
	int index;
	int value;
	
	public Pair(int index, int value) {
		this.index = index;
		this.value = value;
	}
}

public class StocksPan {

	public static void main(String[] args) {
		
		int arr[] = {100, 80, 60, 70, 60, 75, 85};
		int n = arr.length;
		int indexes[] = new int[n];
		int top = 0;
		ArrayDeque<Pair> stack = new ArrayDeque<>();
		
		for(int i=0; i<n; i++) {
			if(stack.isEmpty())
				indexes[top] = 1;
			
			else if(arr[i] < stack.peek().value)
				indexes[top] = stack.peek().index;
			
			else {
				while(!stack.isEmpty() && arr[i] > stack.peek().value)
					stack.pop();
				
				if(stack.isEmpty())
					indexes[top] = -1;
				else
					indexes[top] = stack.peek().index;
			}
			
			stack.push(new Pair(i, arr[i]));
			top++;
		}
		
		for(int i = 0; i < n; i++)
			System.out.print(Math.abs(i - indexes[i])+" ");
	}
}
