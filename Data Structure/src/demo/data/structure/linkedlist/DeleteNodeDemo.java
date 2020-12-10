package demo.data.structure.linkedlist;

class DeleteNode{
	int data;
	DeleteNode next;
	
	DeleteNode(int data){
		this.data = data;
		this.next = null;
	}
}

class Delete{
	
	void delete(DeleteNode node) {
		DeleteNode temp = node.next;
		node.data = temp.data;
		node.next = temp.next;
		temp = null;
	}
	
	void traverse(DeleteNode node) {
		while(node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
	
	void deleteByKey(DeleteNode node, int key) {
		DeleteNode prev = node;
		if(node != null & node.data == key) {
			node = node.next;
			return;
		}
		
		while(node != null && node.data != key) {
			prev = node;
			node = node.next;
		}
		prev.next = node.next;
	}
}

public class DeleteNodeDemo {
	public static void main(String[] args) {
		
		DeleteNode node = new DeleteNode(3);
		node.next = new DeleteNode(7);
		node.next.next = new DeleteNode(6);
		node.next.next.next = new DeleteNode(9);
		node.next.next.next.next = new DeleteNode(11);
		node.next.next.next.next.next = new DeleteNode(14);
		
		Delete delete = new Delete();
		delete.traverse(node);
		delete.delete(node.next.next);
		delete.traverse(node);
		delete.deleteByKey(node, 11);
		delete.traverse(node);
	}
}
