/**
 * 
 */
package demo.data.structure.linkedlist;

/**
 * @author Mayank
 *
 */
class SearchNode{
	int data;
	SearchNode next;
	
	SearchNode(int data){
		this.data = data;
		this.next = null;
	}
}

class SearchElement{
	int search(SearchNode node, int data) {
		if(node == null)
			return -1;
		
		if(node.data == data)
			return data;
		
		return search(node.next, data);
	}
}

public class SearchElementDemo {
	
	public static void main(String[] args) {
		SearchNode node = new SearchNode(5);
		node.next = new SearchNode(4);
		node.next.next = new SearchNode(6);
		node.next.next.next = new SearchNode(9);
		
		SearchElement element = new SearchElement();
		int key = element.search(node, 11);
		System.out.println(key);
	}
}
