/**
 * 
 */
package demo.data.structure.linkedlist;

/**
 * @author Mayank
 *
 */
class MoveLast{
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	void create() {
		head = new Node(2);
		head.next = new Node(1);
		head.next.next = new Node(9);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(7);
	}
	
	void traverse() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	void moveLastNode() {
		Node prev = null, current = head;
		while(current.next != null) {
			prev = current;
			current = current.next;
		}
		
		prev.next = null;
		current.next = head;
		head = current;
	}
}

public class MoveLastNodeAtFront {

	public static void main(String[] args) {
		
		MoveLast move = new MoveLast();
		move.create();
		move.traverse();
		move.moveLastNode();
		move.traverse();
	}
}
