package demo.data.structure.stack;

import java.util.Stack;

class Pair{
	int key;
	int value;
	
	Pair(int key, int value){
		this.key = key;
		this.value = value;
	}
}

public class StockPanProblem {

	public static void main(String[] args) {
		
		int []stocks = {100, 80, 60, 70, 60, 75, 85};
		int n = stocks.length;
		
		Stack<Pair> stack = new Stack<>();
		int []index = new int[n];
		int top = 0;
		for(int i=0; i<n; i++) {
			
			if(stack.isEmpty()) {
				index[top] = -1;
				top++;
				stack.push(new Pair(stocks[i], i));
			}
			else if(stocks[i] < stack.peek().key){
				index[top] = stack.peek().value;
				top++;
				stack.push(new Pair(stocks[i], i));
			}
			else {
				while(!stack.isEmpty() && stocks[i] > stack.peek().key)
					stack.pop();
				
				if(stack.isEmpty()) {
					index[top] = -1;
					top++;
					stack.push(new Pair(stocks[i], i));
				}
				else {
					index[top] = stack.peek().value;
					top++;
					stack.push(new Pair(stocks[i], i));
				}
			}
			
		}
		
		for(int i=0; i<n; i++)
			System.out.print((i - index[i])+" ");

	}
}
