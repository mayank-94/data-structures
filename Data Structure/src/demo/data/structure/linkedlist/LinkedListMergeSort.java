/**
 * 
 */
package demo.data.structure.linkedlist;

/**
 * @author Mayank
 *
 */
class MergeSort{
	
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	void insert(int value) {
		Node node = new Node(value);
		
		if(head == null) {
			head = node;
			return;
		}
		
		Node temp = head;
		while(temp.next != null)
			temp = temp.next;
		temp.next = node;
	}
	
	Node getMiddle(Node head) {
		
		if(head == null)
			return head;
		
		Node slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	Node mergeSort(Node head) {
		if(head == null || head.next == null)
			return head;
		
		Node middle = getMiddle(head);
		Node nextOfMiddle = middle.next;
		middle.next = null;
		
		Node left = mergeSort(head);
		Node right = mergeSort(nextOfMiddle);
		Node sortedList = merge(left, right);
		
		return sortedList;
	}
	
	Node merge(Node left, Node right) {
		//base condition
		if(left == null) return right;
		if(right == null) return left;
		
		Node result = null;
		if(left.data < right.data) {
			result = left;
			result.next = merge(left.next, right);
		}
		else {
			result = right;
			result.next = merge(left, right.next);
		}
		
		return result;
	}
	
	void traverse() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	
}


public class LinkedListMergeSort {
	public static void main(String[] args) {
				
		MergeSort sort = new MergeSort();
		sort.insert(8);
		sort.insert(5);
		sort.insert(12);
		sort.insert(10);
		sort.insert(9);
		
		sort.mergeSort(sort.head);
		sort.traverse();
		
	}
}
