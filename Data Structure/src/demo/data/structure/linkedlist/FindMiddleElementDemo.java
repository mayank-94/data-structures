/**
 * 
 */
package demo.data.structure.linkedlist;

/**
 * @author Mayank
 *
 */
class MiddleElement{
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
	
	void traverse() {
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	void middleElement() {
		Node slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("Middle element is "+slow.data);
	}
	
}

public class FindMiddleElementDemo {
	
	public static void main(String[] args) {
		MiddleElement element = new MiddleElement();
		element.insert(4);
		element.insert(2);
		element.insert(12);
		element.insert(10);
		element.insert(14);
		element.insert(9);
		
		element.traverse();
		element.middleElement();
	}
}
