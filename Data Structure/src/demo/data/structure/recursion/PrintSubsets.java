/**
 * 
 */
package demo.data.structure.recursion;

/**
 * @author Mayank
 *
 */
public class PrintSubsets {

	public static void main(String[] args) {
		
		String input = "ABC";
		String output = "";
		subsets(input, output);
	}

	private static void subsets(String input, String output) {
		if(input == "" || input.isEmpty()) {
			System.out.print("{"+output+"} ");
			return;
		}
		
		String output1 = output;
		String output2 = output;
		output2 = output2 + input.charAt(0);
		input = input.substring(1);		
		subsets(input, output1);
		subsets(input, output2);
	}
}
