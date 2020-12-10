/**
 * 
 */
package demo.data.structure.linkedlist;
/**
 * @author Mayank
 *
 */
class Rotate{
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

	void rotate(int k) {
		for(int i=1; i<=k; i++) {
			Node temp = head, current = head;
			while(current.next != null) {
				current = current.next;
			}
			
			head = temp.next;
			current.next = temp;
			temp.next = null;
		}
	}
}

public class NodesRotationByk {

	public static void main(String[] args) {
		
		Rotate rotate = new Rotate();
		rotate.create();
		rotate.traverse();
		System.out.println("After Rotation by k elements - ");
		rotate.rotate(2);
		rotate.traverse();
	}
}
