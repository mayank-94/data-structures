/**
 * 
 */
package demo.data.structure.arrays;

/**
 * @author Mayank
 *
 */
public class MergeArrays {
	public static void main(String[] args) {
		
		int a[] = {1, 3, 9, 15, 26, 30, 40};
		int b[] = {4, 6, 10, 18};
		int n1 = a.length;
		int n2 = b.length;
		int c[] = new int[n1+n2];
		int i=0, j=0, k=0;
		
		while(i<n1 && j<n2) {
			if(a[i] < b[j]) {
				c[k] = a[i];
				k++;
				i++;
			}else if(a[i] > b[j]) {
				c[k] = b[j];
				k++;
				j++;
			}
		}
		
		while(i < n1) {
			c[k] = a[i];
			k++;
			i++;
		}
		
		while(j < n2) {
			c[k] = b[j];
			k++;
			j++;
		}
		
		for(int x : c)
			System.out.print(x+" ");
	}
}
