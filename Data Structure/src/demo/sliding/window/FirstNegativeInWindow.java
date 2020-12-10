/**
 * 
 */
package demo.sliding.window;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Mayank
 *
 */
public class FirstNegativeInWindow {

	public static void main(String[] args) {
		
		int arr[] = {12, -2, -1, 8, -5, 8, 10, 19};
		int n = arr.length;
		int k = 3;
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<k; i++) {
			if(arr[i] < 0)
				list.add(arr[i]);
		}
		System.out.print(list.get(0)+" ");
		
		for(int i=k; i<n; i++){
			if(arr[i] < 0)
				list.add(arr[i]);
						
			if(arr[i-k] == list.get(0)) {
				list.remove(0);
			
				if(list.isEmpty())
					System.out.print(0+" ");
				else
					System.out.print(list.get(0)+" ");
			}
			else {
				if(list.isEmpty())
					System.out.print(0+" ");
				else
					System.out.print(list.get(0)+" ");
			}
		}
					
	}
}
