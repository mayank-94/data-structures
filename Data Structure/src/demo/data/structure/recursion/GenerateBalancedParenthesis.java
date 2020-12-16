/**
 * 
 */
package demo.data.structure.recursion;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Mayank
 *
 */
public class GenerateBalancedParenthesis {

	public static void main(String[] args) {
		
		int n = 3;
		int open = n;
		int closed = n;
		String output = "";
		List<String> balanced = new ArrayList<>();
		generateBalanced(open, closed, output, balanced);
		System.out.println(balanced);
	}

	private static void generateBalanced(int open, int closed, String output, List<String> balanced) {
		if(open == 0 && closed == 0) {
			balanced.add(output);
			return;
		}
		
		if(open != 0) {
			String output1 = output;
			output1 = output1 + "(";
			generateBalanced(open - 1, closed, output1, balanced);
		}
		
		if(open < closed) {
			String output2 = output;
			output2 = output2 + ")";
			generateBalanced(open, closed - 1, output2, balanced);
		}
	}
}
