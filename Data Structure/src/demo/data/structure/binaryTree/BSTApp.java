/**
 * 
 */
package demo.data.structure.binaryTree;

/**
 * @author Mayank
 *
 */
class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BST{
	
	public Node insert(Node node, int val) {
		if(node == null)
			return new Node(val);
			
		if(val < node.data)
			node.left = insert(node.left, val);
		else if(val > node.data)
			node.right = insert(node.right, val);
		
		return node;
	}

}

public class BSTApp {
	
	public static void main(String[] args) {
		BSTApp bst = new BSTApp();
		Node node = bst.create();
		Node key = bst.search(node, 13);
		System.out.println(key.data);
	}
	
	private Node search(Node node, int key) {
		if(node == null || node.data == key)
			return node;
		
		if(key < node.data)
			return search(node.left, key);
		else
			return search(node.right, key);
		
	}
	
	private Node create() {
		BST a = new BST();
		Node root = null;
		int array[] = {10, 5, 15, 8, 18, 13, 16, 2, 6};
		for(int x : array)
			root = a.insert(root, x);
		
		return root;
	}
}
