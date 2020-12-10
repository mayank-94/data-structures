/**
 * 
 */
package demo.data.structure.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mayank
 *
 */
class LinkNode{
	
	int data;
	LinkNode next;
	
	LinkNode(int data){
		this.data = data;
		this.next = null;
	}
}

class DetectLoop{
	
	void traverse(LinkNode node) {
		while(node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	boolean isLoop(LinkNode head) {
		Set<LinkNode> set = new HashSet<>();
		
		while(head != null) {
			if(set.contains(head))
				return true;
			else {
				set.add(head);
				head = head.next;
			}
		}
		return false;
	}
	
	void removeLoop(LinkNode head) {
		LinkNode prev = null;
		LinkNode node = head;
		Set<LinkNode> set = new HashSet<>();
		
		while(head != null) {
			if(set.contains(head)) {
				prev.next = null;
				break;
			}
			else {
				set.add(head);
				prev = head;
				head = head.next;
			}
		}
		
		traverse(node);
	}
}

public class DetectLoopCheck {

	public static void main(String[] args) {
		
		LinkNode node = new LinkNode(4);
		node.next = new LinkNode(7);
		node.next.next = new LinkNode(6);
		node.next.next.next = new LinkNode(9);
		node.next.next.next.next = new LinkNode(8);
		
		//creating loop
		node.next.next.next.next.next = node.next.next;
		
		DetectLoop loop = new DetectLoop();
		boolean isLoop = loop.isLoop(node);
		System.out.println(isLoop);
		loop.removeLoop(node);
	}
}
