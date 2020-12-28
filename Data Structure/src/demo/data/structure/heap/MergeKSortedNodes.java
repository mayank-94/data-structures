/**
 * 
 */
package demo.data.structure.heap;

import java.util.PriorityQueue;

/**
 * @author Mayank
 *
 */
class ListNode{
	int data;
	ListNode next;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class MergeKSortedNodes {

	public static void main(String[] args) {
		
		ListNode n1 = new ListNode(1);
		n1.next = new ListNode(4);
		n1.next.next = new ListNode(6);
		
		ListNode n2 = new ListNode(2);
		n2.next = new ListNode(5);
		n2.next.next = new ListNode(8);
		
		ListNode n3 = new ListNode(3);
		n3.next = new ListNode(7);
		
		ListNode []lists = {n1, n2, n3};
		
		ListNode merge = mergeListNodes(lists);
		while(merge != null) {
			System.out.print(merge.data+" ");
			merge = merge.next;
		}
	}

	private static ListNode mergeListNodes(ListNode[] lists) {
		
		PriorityQueue<ListNode> heap = new PriorityQueue<>((a,b) -> a.data - b.data);
		for(int i=0; i<lists.length; i++)
			heap.add(lists[i]);
		
		ListNode head = new ListNode(0);
		ListNode temp = head;
		while(!heap.isEmpty()) {
			temp.next = heap.poll();
			temp = temp.next;
			
			if(temp.next!=null)
				heap.add(temp.next);
		}
		
		return head.next;
	}

}
