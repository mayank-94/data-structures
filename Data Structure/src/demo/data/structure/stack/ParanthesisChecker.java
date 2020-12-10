/**
 * 
 */
package demo.data.structure.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Mayank
 *
 */
public class ParanthesisChecker {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int len = x.length();
		char []paren = x.toCharArray();
		Stack<Character> result = new Stack<>();
		for(int i=0; i<len; i++) {
			if(paren[i] == '[' || paren[i] == '{' || paren[i] == '(') {
				result.push(paren[i]);
			}
			
			if(paren[i] == ']') {
				if(result.isEmpty()) return;
				
				else if(result.peek() == '[')
					result.pop();
				
				else return;
			}
			
			if(paren[i] == '}') {
				if(result.isEmpty()) return;
				
				else if(result.peek() == '{')
					result.pop();
				else return;
			}
			
			if(paren[i] == ')') {
				if(result.isEmpty()) return;
				
				else if(result.peek() == '(')
					result.pop();
				else return;
			}
		}
		
		if(result.isEmpty())
			System.out.println("Balanced..");
		
		else
			System.out.println("Unbalaned..");
		
		sc.close();

	}

}
