/**
 * 
 */
package demo.data.structure.linkedlist;

/**
 * @author Mayank
 *
 */

class CountNodes{
	Node head;
	
	class Node{
		@SuppressWarnings("unused")
		private int data;
		private Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	void insert(int data) {
		Node node = new Node(3);
		if(head == null)
		{
			head = node;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	int count(Node node) {
		if(node == null)
			return 0;
		
		return 1 + count(node.next);
	}
}

public class CountNodesDemo {

	public static void main(String[] args) {
		
		CountNodes count = new CountNodes();
		count.insert(3);
		count.insert(1);
		count.insert(6);
		int nodes = count.count(count.head);
		System.out.println("Number of nodes = "+nodes);
	}
}
