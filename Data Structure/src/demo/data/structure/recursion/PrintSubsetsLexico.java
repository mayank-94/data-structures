/**
 * 
 */
package demo.data.structure.recursion;

import java.util.TreeSet;
import java.util.Set;

/**
 * @author Mayank
 *
 */
public class PrintSubsetsLexico {

	public static void main(String[] args) {
		
		String input = "abc";
		String output = "";
		Set<String> subsets = new TreeSet<>();
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
