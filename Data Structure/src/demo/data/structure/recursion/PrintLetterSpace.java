/**
 * 
 */
package demo.data.structure.recursion;

/**
 * @author Mayank
 *
 */
public class PrintLetterSpace {
	public static void main(String[] args) {
		
		String ip = "ABC";
		String op = ""+ip.charAt(0);
		ip = ip.substring(1);
		printLetterSpace(ip, op);
	}

	private static void printLetterSpace(String ip, String op) {
		
		if(ip == "" || ip.isEmpty()) {
			System.out.print(op+"  ");
			return;
		}
		String op1 = op;
		String op2 = op;
		op1 = op1 + "_" + ip.charAt(0);
		op2 = op2 + ip.charAt(0);
		ip = ip.substring(1);
		printLetterSpace(ip, op1);
		printLetterSpace(ip, op2);
	}
}
