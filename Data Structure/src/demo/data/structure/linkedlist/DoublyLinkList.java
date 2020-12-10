/**
 * 
 */
package demo.data.structure.linkedlist;

/**
 * @author Mayank
 *
 */
class DLL{
	private Node head;
	
	class Node{
		private int data;
		private Node next;
		private Node prev;
		
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	void insertAtHead(int value) {		
		Node newNode = new Node(value);
		newNode.next = head;
		newNode.prev = null;
		
		if(head != null)
			head.prev = newNode;
		
		head = newNode;
		
	}
	
	void insertAtEnd(int value) {
		Node newNode = new Node(value);
		newNode.next = null;
		newNode.prev = null;
		
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
		newNode.prev = temp;
		
	}
	
	void traverse() {
		Node temp = head;
		Node last = head;
		System.out.println("Forward Traversal");
		while(temp != null) {
			System.out.print(temp.data+" ");
			last = temp;
			temp = temp.next;
		}
		System.out.println();
		System.out.println("Backward Traversal");
		while(last != null) {
			System.out.print(last.data+" ");
			last = last.prev;
		}
	}
}

public class DoublyLinkList {

	public static void main(String[] args) {
		
		DLL doublyList = new DLL();
		doublyList.insertAtHead(8);
		doublyList.insertAtHead(10);
		doublyList.insertAtHead(5);
		doublyList.insertAtEnd(20);
		doublyList.insertAtEnd(12);
		doublyList.insertAtEnd(2);
		
		doublyList.traverse();
		
	}
}
