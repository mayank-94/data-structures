/**
 * 
 */
package demo.data.structure.recursion;

import java.util.Set;
import java.util.HashSet;

/**
 * @author Mayank
 *
 */
public class PrintUniqueSubsets {

	public static void main(String[] args) {
		
		String input = "aab";
		String output = "";
		Set<String> subsets = new HashSet<>();
		printSubsets(input, output, subsets);
		
		for(String str : subsets)
			System.out.print("{"+str+"} ");
	}

	private static void printSubsets(String input, String output, Set<String> subsets) {	
		if(input == "" || input.isEmpty()) {
			subsets.add(output);
			return;
		}
		
		String output1 = output;
		String output2 = output;
		output2 = output2 + input.charAt(0);
		input = input.substring(1);
		printSubsets(input, output1, subsets);
		printSubsets(input, output2, subsets);		
	}
}
