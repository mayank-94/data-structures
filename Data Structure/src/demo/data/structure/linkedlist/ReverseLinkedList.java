/**
 * 
 */
package demo.data.structure.linkedlist;

/**
 * @author Mayank
 *
 */
class Reverse{
	Node head;
	
	class Node{
		int data;
		Node next;
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
	
	void reverse() {
		Node current = head, prev = null, next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	void traverse() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		Reverse reverse = new Reverse();
		reverse.insert(8);
		reverse.insert(5);
		reverse.insert(9);
		reverse.insert(3);
		reverse.traverse();
		reverse.reverse();
		reverse.traverse();
	}
}
