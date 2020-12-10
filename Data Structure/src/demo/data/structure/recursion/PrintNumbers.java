/**
 * 
 */
package demo.data.structure.recursion;

/**
 * @author Mayank
 *
 */
class Print1ToN{
	
	void print1ToN(int n) {
		if(n == 1) {
			System.out.print(n+" ");
			return;
		}
		
		print1ToN(n-1);
		System.out.print(n+" ");
	}
	
	void printNTo1(int n) {
		if(n == 1) {
			System.out.print(n+" ");
			return;
		}
		
		System.out.print(n+" ");
		printNTo1(n-1);
	}
	
}

public class PrintNumbers {

	public static void main(String[] args) {
		
		Print1ToN printNum = new Print1ToN();
		printNum.print1ToN(3);
		System.out.println();
		printNum.printNTo1(5);
	}
}
