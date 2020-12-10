/**
 * 
 */
package demo.data.structure.linkedlist;

/**
 * @author Mayank
 *
 */

class LinkList{
	
	private Node head;
	
	class Node{
		
		private int data;
		private Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	void insertAtHead(int value) {
		
		Node new_node = new Node(value);
		new_node.next = head;
		head = new_node;
	}
	
	void insertAtEnd(int value) {
		
		Node new_node = new Node(value);
		if(head == null) {
			head = new_node;
			return;
		}
		
		Node last = head;
		while(last.next != null) 
			last = last.next;
		
		last.next = new_node;
	}
	
	int getCount() {
		Node temp = head;
		return getCountRecursive(temp);
	}

	private int getCountRecursive(Node temp) {
		if(temp == null)
			return 0;
		
		return 1 + getCountRecursive(temp.next);
	}
	
	void getNthFromLast(int n) {
		Node temp = head;
		int result = getNthFromLast(temp, n);
		System.out.println(result);
	}
	
	int getNthFromLast(Node head, int n)
    {
    	Node temp = head;
    	int count = getCountRecursive(temp);
    	if(n > count)
    	    return -1;
	    
	    int counter = 0;
	    while(head != null){
	       
	        if(counter == (count - n))
	            return head.data;
	        
	        counter++;
	        head = head.next;     
	    }
	    
	    return -1;
    }
	
	void reverseInGroups(int k) {
		Node node = head;
		head = reverseInGroupsRec(node, k);
	}
	
	Node reverseInGroupsRec(Node node, int k){
		
		Node current = node;
		Node prev = null;
		Node next = null;

		int ct = 0;
		while(ct < k && current != null) {	
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			ct++;
		}
		
		if(next != null) {
			node.next = reverseInGroupsRec(next, k);
		}
		
		return prev;
	}
		
}

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkList list = new LinkList();
//		list.insertAtHead(5);
//		list.insertAtHead(8);
//		list.insertAtHead(17);
		list.insertAtEnd(10);
		list.insertAtEnd(2);
		list.insertAtEnd(8);
		list.insertAtEnd(5);
		list.insertAtEnd(15);
		list.insertAtEnd(11);
		
		//list.traverse();
		System.out.println();
		
		list.getNthFromLast(2);
		//boolean exist = list.search(28);

	}

}
