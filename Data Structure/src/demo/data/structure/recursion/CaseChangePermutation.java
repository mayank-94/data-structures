/**
 * 
 */
package demo.data.structure.recursion;

/**
 * @author Mayank
 *
 */
public class CaseChangePermutation {

	public static void main(String[] args) {
		
		String input = "a1B";
		String output = "";
		caseChange(input, output);
	}

	private static void caseChange(String input, String output) {
		
		if(input == "" || input.isEmpty()) {
			System.out.print(output+"  ");
			return;
		}
		
		int n = input.charAt(0);
		if(n >= 48 && n <= 57){
			output = output + input.charAt(0);
	        input = input.substring(1);
	        caseChange(input, output);
	    }else {
			String output1 = output;
	        String output2 = output;
	        String c = ""+input.charAt(0);
	        
	    	output1 = output1 + c.toLowerCase();
	        output2 = output2 + c.toUpperCase();
	        input = input.substring(1);
			caseChange(input, output1);
			caseChange(input, output2);
	    }
	}
}
