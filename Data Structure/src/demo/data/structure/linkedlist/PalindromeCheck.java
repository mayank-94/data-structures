/**
 * 
 */
package demo.data.structure.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Mayank
 *
 */
class Palindrome{
	Node head;
	
	class Node{
		private int data;
		private Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	boolean isPalindrome() {
		Node current = head;
		Deque<Integer> stack = new ArrayDeque<>();
		while(current != null) {
			stack.push(current.data);
			current = current.next;
		}
		
		while(head != null) {
			if(head.data != stack.peek())
				return false;
			
			stack.pop();
			head = head.next;
		}
		
		return true;
	}
}

public class PalindromeCheck {

	public static void main(String[] args) {
		
		Palindrome palin = new Palindrome();
		palin.insert(3);
		palin.insert(2);
		palin.insert(1);
		palin.insert(2);
		palin.insert(3);
		
		boolean isPalin = palin.isPalindrome();
		System.out.println(isPalin);

	}

}
