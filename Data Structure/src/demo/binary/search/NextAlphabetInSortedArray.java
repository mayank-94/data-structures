/**
 * 
 */
package demo.binary.search;

/**
 * @author Mayank
 *
 */
public class NextAlphabetInSortedArray {

	public static void main(String[] args) {
		
		char []letters = {'a', 'd', 'e', 'f', 'f', 'j', 'm', 'r'};
		char target = 'f';
		char letter = findNextLetter(letters, target);
		System.out.println("Next letter is "+letter);
	}

	private static char findNextLetter(char[] letters, char target) {
		int low = 0;
		int high = letters.length - 1;
		char letter = '\0';
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(letters[mid] == target)
				low = mid + 1;
			
			if(letters[mid] > target) {
				letter = letters[mid];
				high = mid - 1;
			}
			else if(letters[mid] < target)
				low = mid + 1;
		}
		
		return letter;
	}
}
