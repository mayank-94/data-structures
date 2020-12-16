/**
 * 
 */
package demo.data.structure.recursion;

/**
 * @author Mayank
 *
 */
public class N_Bit_Binary {

	public static void main(String[] args) {
		
		int n = 4;
		int one = 0, zero = 0;
		String output = "";
		n_bit(one, zero, n, output);
	}

	private static void n_bit(int one, int zero, int n, String output) {
		
		if(n == 0) {
			System.out.print(output+" ");
			return;
		}
		
		if(one == zero) {
			String output1 = output;
			output1 = output1 + "1";
			n_bit(one + 1, zero, n - 1, output1);
		}else {
			String output2 = output;
			String output3 = output;
			output2 = output2 + "1";
			output3 = output3 + "0";
			n_bit(one + 1, zero, n - 1, output2);
			n_bit(one, zero + 1, n - 1, output3);
		}
	}
}
